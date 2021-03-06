package dp15.behavioral_03.chainOfResponsibility;

public class Gk2_SubtractionNumbers implements ChainBehaviourInterface {
	
	private ChainBehaviourInterface nextChain;

	@Override
	public void setNextChain(ChainBehaviourInterface chain) {
		
		this.nextChain=chain;

	}

	@Override
	public void calculateNumbers(NumberClass number) {
		
		if(number.getCommand().equals("SUBSTRACT")) {
			
			int result = number.getNumber1() - number.getNumber2();
			
			System.out.println("The Substraction of "+ number.getNumber1() + " & " +
					number.getNumber2() + " is: "+result);
			
		}else {
			// First Chain of Responsibility
			nextChain.calculateNumbers(number);
		}

	}

}
