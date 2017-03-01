package com.scb.jms.mq;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import javax.inject.Named;
import javax.jms.JMSException;
import javax.jms.TextMessage;
import java.util.function.Consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Named
@Transactional
public class MQGateway {
	
	private static final Logger log = LoggerFactory.getLogger(MQGateway.class);
	
    private JmsTemplate jmsTemplate;

    private MQProperties properties;

    private Consumer<String> messageConsumer;

    @Inject
    public MQGateway(JmsTemplate jmsTemplate, MQProperties properties, @Named("messageConsumer") Consumer<String> messageConsumer) {
        this.jmsTemplate = jmsTemplate;
        this.properties = properties;
        this.messageConsumer = messageConsumer;
    }

    @JmsListener(destination = "${pl.ciruk.blog.mq.incoming-queue}", containerFactory = "defaultJmsListenerContainerFactory")
    public void onMessage(TextMessage message) throws JMSException {
        log.info("onMessage");
        log.debug("onMessage - Message: {}", message);

        try {
            messageConsumer.accept(message.getText());
        } catch (JMSException e) {
            log.error("Cannot consume message: {}", message, e);
        }

    }

    public void send(String message) {
        log.info("send");
        log.debug("send - Message: {}", message);

        jmsTemplate.convertAndSend(properties.getOutgoingQueue(), message);
    }
}
