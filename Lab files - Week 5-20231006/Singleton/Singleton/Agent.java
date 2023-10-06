
/**
 *
 * @author phaedramohammed
 * Question 1: fix the code n agent that keeps track of the number of 
 * requests made for a reference to the agent using the Singleton design pattern.
 * 
 */

public class Agent {
    private static Agent agentInstance;
    private static int numRequests;
    
    private Agent(){
        numRequests = 0;
    }

    public static Agent getAgent(){
        if(agentInstance == null) // ENSURES AGENT EXISTS ONLY ONCE
        agentInstance = new Agent();
        numRequests++;
        return agentInstance;     // one agent is being incremented
    }

    public String toString(){
        return "C'est moi, le singleton agent pour le " +numRequests + " fois!";
    }
}