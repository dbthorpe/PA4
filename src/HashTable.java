// PA4
// Authors: David Thorpe, Melinda Ryan 
// Date: 11/19/2014
// Class: CS200

public class HashTable implements TermIndex
{
	//Size of the hashtable array
	private int arraySize;
	
	//Initial array size to be read from file
	public HashTable(int arraySize)
	{
		this.arraySize = arraySize;
	}
	
	/*The add method will need to expand the size of the array and re-hash all the entries 
	 * when it approaches becoming full. Use a threshold of 80% full as the trigger for when to 
	 * re-build the hash table. The code should calculate the next size using the following equation: 
	 * new_size = (2 * current_size) + 1
	 */
	public void add(String filename, String newWord) 
	{
		// TODO Auto-generated method stub
		
	}

	//returns the number of unique words in the document (i.e., count).
	public int size() 
	{
		
		return arraySize;
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

}
