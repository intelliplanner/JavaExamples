package collection.ConsumerProducerProb;

/** Purpose: Encapsulates message behavior; it manages collection data reliably. Owner: Virendra Gupta. */
public class Message {
String msg;

/** Purpose: Creates a message instance. */
Message(String msg){
	this.msg=msg;
}

/** Purpose: Retrieves get msg data. */
public String getMsg() {
	return msg;
}

/** Purpose: Updates set msg data. */
public void setMsg(String msg) {
	this.msg = msg;
}
}
