package collection.ConsumerProducerProb;

/**
 * Encapsulates message behavior for collection data management and lookup.
 */
public class Message {
String msg;

/**
 * Creates a configured message instance for the represented workflow.
 */
Message(String msg){
	this.msg=msg;
}

/**
 * Retrieves or locates get msg data needed for decision-making.
 */
public String getMsg() {
	return msg;
}

/**
 * Updates set msg while keeping domain data consistent.
 */
public void setMsg(String msg) {
	this.msg = msg;
}
}
