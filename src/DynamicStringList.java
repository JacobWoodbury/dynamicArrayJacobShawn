public class DynamicStringList implements StringList {
    String[] list = new String[10];
    int endOfList = 0;
      /**
   * Retrieves the string at the specified index in the list.
   *
   * @param index the index of the string to retrieve.
   * @return the string at the specified index.
   * @throws IndexOutOfBoundsException if the index is out of range (index < 0 or index >= size()).
   */
    public String get(int index)
    {        
        if(index < 0 || index >= list.length)
        {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return list[index];
    }

      /**
   * Replaces the string at the specified index with the given value.
   *
   * @param index the index of the string to replace.
   * @param value the new value to set at the specified index.
   * @throws IndexOutOfBoundsException if the index is out of range (index < 0 or index >= size()).
   */
    public void set(int index, String value)
    {
        if(index < 0 || index >= list.length)
        {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        list[index] = value;
    }

  /**
   * Adds a new string to the end of the list.
   *
   * @param value the string to add to the list.
   */
    public void add(String value)
    {
        if(endOfList == list.length){
            String[] newList = new String[list.length * 2];
            for(int i=0; i<list.length; i++){
                newList[i] = list[i];
            }
            newList[list.length] = value;
            
        }else{
        list[endOfList] = value;
        endOfList++;
        }
    }

    /**
     * Removes the string at the specified index from the list.
     *
     * @param index the index of the string to remove.
     * @return the string that was removed.
     * @throws IndexOutOfBoundsException if the index is out of range (index < 0 or index >= size()).
     */
    public String remove(int index){
        if(index < 0 || index >= list.length)
        {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        String toRemove = list[index];
        for (int i = index; i < endOfList; i++) {
            list[i] = list[i+1];
        }
        endOfList--;
        return toRemove;
    }
  
    /**
     * Returns the number of strings currently in the list.
     *
     * @return the size of the list.
     */
    public int size()
    {
        return endOfList;
    }
  
    /**
     * Returns the current capacity of the list (i.e., the number of elements it can hold before resizing).
     *
     * @return the capacity of the list.
     */
    public int capacity()
    {
        return list.length;
    }
  
}
