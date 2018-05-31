public class Notepad {

  /** Default size of Notepad */

  private static final int ARRAYSIZE = 5;

  /** Create the array of notes*/

  private Notes[] array = new Notes[ARRAYSIZE];

  /** The last note in the array*/

  private int lastNote=0;

  /** Realize the method "add"
   * @param note note
   * */

  void addNote (String note){
    if (lastNote > ARRAYSIZE)
      throw new UnsupportedOperationException("Превышен размер массива. Запись не может быть добавлена");
    array[lastNote] = new Notes();
    array[lastNote++].setNote(note);
  }

  /** Realize the method "remove"
   * Remove note by number of note
   * @param numberNote numberNote
   * */

  void removeNote (int numberNote){
    System.arraycopy(
            array, numberNote, array,
            numberNote - 1, this.lastNote - numberNote);
    this.lastNote--;
    }

  /** Realize the method "edit"
   * @param numberNote NumberNote
   * @param note note*/

  void editNote (int numberNote, String note){
    if (numberNote <= lastNote)
      array[numberNote-1].setNote(note);
    else
      throw new UnsupportedOperationException("Такой записи нет");
  }

  /** Realize the method "view all notes" */

  void viewAllNotes (){
    for (int i = 0; i < lastNote; i++) {
        System.out.println(array[i].getNote());
    }
  }

  public static void main (String[] args) {
    Notepad test = new Notepad();
    test.addNote("1");
    test.addNote("2");
    test.addNote("3");
    test.addNote("4");
    test.addNote("5");
    test.removeNote(3);
    test.editNote(1,"Yahoo");
    test.viewAllNotes();
  }
}