
public class VerbReplacementDecorator implements MadLibsDecorator {
	private String[] verbsToUse;
	private int indexIntoArray;
	private MadLibsDecorator mlDecorator;
	public VerbReplacementDecorator(MadLibsDecorator ml)
	{
		mlDecorator = ml;
		verbsToUse = new String[] {"run","jump","kick","scream","cry","hunt","fly",
				"fight","hold","drive","throw","shoot","wash","use"};
		indexIntoArray = 0;
	}
	public String decorateString()
	{
		String retVal = mlDecorator.decorateString();
		String[] words = retVal.split(" ",0);
		for(int i = 0; i <words.length; i++ )
		{
			if(words[i].compareTo("<verb>")==0)
			{
				words[i]=verbsToUse[indexIntoArray];
				indexIntoArray++;
				if(indexIntoArray >= verbsToUse.length)
				{
					indexIntoArray = 0;
				}
			}
		}
		retVal = String.join(" ", words);
		return retVal;
	}

}
