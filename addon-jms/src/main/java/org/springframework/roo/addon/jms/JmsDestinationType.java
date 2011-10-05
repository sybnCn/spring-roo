package org.springframework.roo.addon.jms;

/**
 * JMS destination types known to the JMS add-on.
 *
 * @author Stefan Schmidt
 * @since 1.0
 */
public enum JmsDestinationType {
	TOPIC,
	DURABLE_TOPIC,
	QUEUE;
}