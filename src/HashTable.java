// PA4
// Authors: David Thorpe, Melinda Ryan 
// Date: 11/19/2014
// Class: CS200

public class HashTable implements TermIndex
{
	//Size of the hashtable array
	private int arraySize;
	
	//number of unique words in the hashtable
	private int count;
	
	//Hash table
	private Term[] table;
	
	//Initial array size to be read from file
	public HashTable(int arraySize)
	{
		this.arraySize = arraySize;
		count = 0;
		table = new Term[this.arraySize];
	}
	
	/*The add method will need to expand the size of the array and re-hash all the entries 
	 * when it approaches becoming full. Use a threshold of 80% full as the trigger for when to 
	 * re-build the hash table. The code should calculate the next size using the following equation: 
	 * new_size = (2 * current_size) + 1
	 */
	public void add(String filename, String newWord) 
	{
		//create a term from the word
		Term term = new Term(newWord);
		
		//generate a hash function for the Term word
		int code = Math.abs(newWord.toLowerCase().hashCode());
		
		//if the word is already in the table, increment the frequency
		if(contains(term))
		{
			get(newWord, false).incFrequency(filename);
		}
				
		//if the word is not in the table, add it
		else
		{
			count++; //increment number of unique words ***Need to check for resizing***
			term.incFrequency(filename);
			
			//If nothing at hash function location, add term
			if(table[code] == null)
				table[code] = term;
			
			//If location occupied, try quadratic probing
			else
			{
				//Number of probes should not exceed table size
				int numProbes = 0;
			}
		}
		
		
		
	}

	//returns the number of unique words in the document (i.e., count).
	public int size() 
	{
		return count;
	}

	public void delete(String word) 
	{
		// TODO Auto-generated method stub
		
	}

	//returns the Term object for the word. Boolean printP not used
	public Term get(String word, Boolean printP) 
	{
		// TODO Auto-generated method stub
		return null;
	}
	
	public boolean contains(Object other) 
	{
		if(other instanceof Term)
		{
			Term otherTerm = (Term) other;
			if(get(otherTerm.getName(), false)!=null)
				return true;
		}
		return false;
	}

}
