public class Race
{
  private int strength;
  private int agility;
  private int intellect;
  private static final int luck = (int) (Math.random() * 5) + 1;
  private static boolean knowsMagic;
    
  public Race(int str, int agi, int intel)
  {
    strength = str;
    agility = agi;
    intellect = intel;
    knowsMagic = false;
  }
  
  public Race(int str, int agi, int intel, boolean magic)
  {
    strength = str;
    agility = agi;
    intellect = intel;
    knowsMagic = magic;
  }
  
  //setters
  public void increaseStr() 
  { strength ++; }
  
  public void increaseStr(int str)
  { strength += str; }
  
  public void increaseAgi()
  { agility ++; }
  
  public void increaseAgi(int agi)
  { agility += agi; }
  
  public void increaseIntel()
  { intellect ++; }
  
  public void increaseIntel(int intel)
  { intellect += intel; }
  
  public void decreaseStr()
  { strength --; }
  
  public void decreaseStr(int str)
  { strength -= str; }
  
  public void decreaseAgi()
  { agility --; }
  
  public void decreaseAgi(int agi)
  { agility -= agi; }
  
  public void decreaseIntel()
  { intellect --; }
  
  public void decreaseIntel(int intel)
  { intellect -= intel; }
  
  //Getters
  public int showStr()
  { return strength; }
  
  public int showAgi()
  { return agility; }
  
  public int showIntel()
  { return intellect; }
  
  public static int showLuck()
  { return luck; }
  
  public void setMagic()
  { knowsMagic = true; }
  
  public boolean showKnowsMagic()
  { return knowsMagic; }
  
  public void setCheat()
  {
    strength += (Integer.MAX_VALUE - 100);
    agility += (Integer.MAX_VALUE - 100);
    intellect += (Integer.MAX_VALUE - 100);
    knowsMagic = true;
  }
  
  public String toString()
  {
    System.out.println("");
    if (Race.knowsMagic == true)
    {
      return "Your stats, for now, are: \n strength: " + strength + " \n agility: " + agility +
      " \n intellect: " + intellect + "\n You also have a sound knowledge of magic.";
    }
    else
    {
    return "Your stats, for now, are: \n strength: " + strength + " \n agility: " + agility +
      " \n intellect: " + intellect;
    }
  }
}