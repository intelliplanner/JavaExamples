package InterviewQuestions.CricketMatch;

import java.util.List;

/**
 * Encapsulates match behavior for the represented coding problem.
 */
public class Match {
	String matchType;
	int matchScore;
	List<PlayerDetails> pd;
	/**
 * Creates a configured match instance for the represented workflow.
 */
	public Match(String matchType,	int matchScore,List<PlayerDetails> pd){
		this.matchScore=matchScore;
		this.matchType=matchType;
		this.pd=pd;
	}
}
