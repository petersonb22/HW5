
public class NounReplacementDecorator {
	private String[] nounsToUse;
	private int indexIntoArray;
	private MadLibsDecorator mlDecorator;
	public NounReplacementDecorator(MadLibsDecorator ml)
	{
		mlDecorator = ml;
		nounsToUse = new String[] {"leg","sword","tool","hair","fish","rabbit","card",
				"can","trash","car","tube","hoop","soap","fan"};
		indexIntoArray = 0;
	}
	public String decorateString()
	{
		String retVal = mlDecorator.decorateString();
		String[] words = retVal.split(" ",0);
		for(int i = 0; i <words.length; i++ )
		{
			if(words[i].contains("<noun>"))
			{
				words[i]=nounsToUse[indexIntoArray];
				indexIntoArray++;
				if(indexIntoArray >= nounsToUse.length)
				{
					indexIntoArray = 0;
				}
			}
		}
		retVal = String.join(" ", words);
		return retVal;
	}
}
