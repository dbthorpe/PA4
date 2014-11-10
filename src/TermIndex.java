// PA4
// Authors: David Thorpe, Melinda Ryan 
// Date: 11/19/2014
// Class: CS200

public interface TermIndex 
{
    public void add(String filename, String newWord);

    public int size();

    public void delete(String word);

    public Term get(String word, Boolean printP);
}
