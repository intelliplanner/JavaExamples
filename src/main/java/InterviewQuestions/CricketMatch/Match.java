package InterviewQuestions.CricketMatch;

import java.util.List;

/** Purpose: Encapsulates match behavior; it solves the represented coding problem. Owner: Virendra Gupta. */
public class Match {
	String matchType;
	int matchScore;
	List<PlayerDetails> pd;
	
	/** Purpose: Creates a match instance. */
	public Match(String matchType,	int matchScore,List<PlayerDetails> pd){
		this.matchScore=matchScore;
		this.matchType=matchType;
		this.pd=pd;
	}
}
