import java.util. *;

public class MainScreen
{
  static Scanner r = new Scanner(System.in);
  static Scanner j = new Scanner(System.in);
  
  public static void main(String[] args)
  {
    startGame();
  }
  
  public static void startGame()
  {
    System.out.println("Hello and welcome to \"Fantasy Campaign\", a choose your own adventure game.");
    System.out.println("");
    System.out.println("The choices you make during your adventure will affect your outcome.");
    System.out.println("");
    System.out.println("Here we go. From this point on, choose the letter for your choice.");
    System.out.println("Choose your race: \n A) Human \n B) Elf");
    String race = r.nextLine();
    
    while (!(race.equalsIgnoreCase("A") || race.equalsIgnoreCase("B")))
    {
      wrongChoice();
      System.out.println("Here we go. Choose your race: \n A) Human \n B) Elf");
      race = r.nextLine();
    }
    
    if (race.equalsIgnoreCase("A")) //Human Path
    {
      Race human = new Race (5, 5, 5);
      System.out.println("");
      System.out.println("Would you like to test your luck in order to max your skills?(Cheat mode) \n Enter A for yes. If not, enter not A.");
      System.out.println("");
      String cheat = r.nextLine();
      if (cheat.equalsIgnoreCase("A"))
      {
        int chance = (int)(Math.random() * 100);
        System.out.println("");
        if (chance > 95)
        {
          human.setCheat();
          System.out.println("Congrats. The fantasy gods must've been on your side as your skills are now maxed.");
          System.out.println("");
        } 
        else
        {
          System.out.println("Aw too bad. Your skills were not maxed. Looks like the fantasy gods are not on your side. Maybe next time when you decided to try again.");
          System.out.println("");
        }
      }
      
      System.out.println("");
      System.out.println("Here's the storyline:");
      System.out.println("");
      System.out.println("You are a human, born in the town of Northon, in the Kingdom of Erinold.");
      System.out.println("Your father was a professional soldier in the King's army. You rarely see him as he comes home only once every year.");
      System.out.println("Your mother worked part-time as a waitress in the town tavern. She took care of you and the home you lived in.");
      System.out.println("You had a peaceful life growing up and when you turn 18, you decided to get a job.");
      System.out.println("");
      System.out.println("What job did you choose?: \n A) Town Guard \n B) Messenger \n C) Wizard's Apprentice");
      String job = j.nextLine();
      
      while (!(job.equalsIgnoreCase("A") || job.equalsIgnoreCase("B") || job.equalsIgnoreCase ("C")))
      {
        wrongChoice();
        System.out.println("What job did you choose?: \n A) Town Guard \n B) Messenger \n C) Wizard's Apprentice");
        job = j.nextLine();
      }
      
      if (job.equalsIgnoreCase("A"))
      {
        System.out.println("");
        System.out.println("Being a town guard was a boring job. Northon was at peace and so no bandits or foreign armies terrorize you.");
        System.out.println("All you did was looked over the walls into the horizons and lifted weights in the armoury every single day.");
        System.out.println("Though you did become stronger from lifting weights," + 
                          " you realized there isn't much in this job and so you decided to become an adventurer to explore the world ");
        System.out.println("");
       human.increaseStr();
      }
      
      if (job.equalsIgnoreCase("B"))
      {
        System.out.println("");
        System.out.println("As a messenger, your job was to deliver messages and letters to Northon's residents.");
        System.out.println("This job meant you have to be quick on your feet and in a year, you beat the record in delivering the most " + 
                           "letters in the least amount of time.");
        human.increaseAgi();
        System.out.println("After two years, you got tired of this job and so you decided to become an adventurer to explore the world"); 
        System.out.println("");
      }
      
      if (job.equalsIgnoreCase("C"))
      {
        System.out.println("");
        System.out.println("Being a wizard's apprentice meant lots of studying. You read old tomes and scripts in order to perfect the use of magic.");
        System.out.println("You did not find much chance to exercise and so your physical abilities got worse as time went on.");
        System.out.println("After 20 years, you were as skilled as your master and you became his successor when he died."); 
        human.setMagic();
        human.increaseIntel(3);
        human.decreaseStr(2);
        human.decreaseAgi(2);
        System.out.println("You inherited his cottage and lived a peaceful life until you feel restless and set out to explore the world."); 
        System.out.println("");
      }
      
      System.out.println(human.toString());
      System.out.println("");
      System.out.println("And so you packed your things and began to leave the town you grew up in.");
      System.out.println("You traveled through the gate of Northon and ran into some thugs harassing a farmer.");
      System.out.println("");
      System.out.println("What do you do?: \n A) Throw a right hook into the back of one of the thugs \n B) Ignore them and continue on your way" + 
                         "\n C) Try to blast them with magic \n D) Taunt them and call them weak for harrassing a simple farmer.");
      String thug = r.nextLine();
      
      while (!(thug.equalsIgnoreCase("A") || thug.equalsIgnoreCase("B") || thug.equalsIgnoreCase("C") || thug.equalsIgnoreCase("D")))
      {
        wrongChoice();
        System.out.println("What do you do?: \n A) Throw a right hook into the back of one of the thugs \n B) Ignore them and continue on your way" + 
                         "\n C) Try to blast them with magic \n D) Taunt them and call them weak for harrassing a simple farmer.");
        thug = r.nextLine();
      }
      
      if (thug.equalsIgnoreCase("A"))
      {
        System.out.println("");
        System.out.println("You walked up to one of the thugs and punched him in the back.");
        if (human.showStr() >= 6)
        {
          System.out.println("You felt a crunch as your fist bounced off the thug's back.");
          System.out.println("He fell to the ground and yelled out that he can't feel his lower body.");
          System.out.println("The other thugs turned around, saw their comrade crippled, and ran to avoid the same fate.");
          System.out.println("The farmer thanked you and invited you to his home to reward you for sticking up for him.");
          System.out.println("You left the crippled thug on the ground and walked with the farmer to his home.");
          System.out.println("Suddenly, you feel a sharp pain on your thigh.");
          System.out.println("The farmer had stabbed you! He slipped into the nearby forest and you are unable to chase him.");
          System.out.println("You took the knife out, yelled out in pain, and bandaged your wound.");
          System.out.println("Looks like your agility took a hit from that.");
          human.decreaseAgi();
        }
        else
        {
          System.out.println("The thugs turned around and thrashed you as you are not strong enough to take them on.");
          System.out.println("Seems like your self-confident took a hit from that beating.");
        }
      }
      
      if (thug.equalsIgnoreCase("C"))
      {
        if (human.showKnowsMagic() == true)
        {
          System.out.println("");         
          System.out.println("You conjured up pure energy and released it on the group.");
          System.out.println("The group immediately got incinerated, including the farmer. Looks like you underestimated your power."); 
        }
        else
        {
          System.out.println("");          
          System.out.println("You don't know magic. So you can't ....");
          System.out.println("Embarrassed at your lack of knowledge, you ran past the group.");
        } 
      }
      
      if (thug.equalsIgnoreCase("D"))
      {
        System.out.println("");        
        System.out.println("You taunted the thugs and compared them to hyenas.");
        System.out.println("The thugs are outright furious and challenged you to fight them.");
        System.out.println("");
        System.out.println("Enter A if you accept their challenge. If not, then you run away like the coward you are.");
        String challenge = r.nextLine();
        if (challenge.equalsIgnoreCase("A"))
        {
          if (human.showStr() >= 5 && human.showAgi() >= 5)
          {
            System.out.println("You accepted their challenge by dishing out the first hit.");
            System.out.println("With your agility, you launched yourself at the closest thug and punched him right through his eye.");
            System.out.println("He staggered and fell backwards onto the ground, with blood gushing through one of his eyes.");
            System.out.println("The remaining thugs were so shocked at this that they asked why you were doing this.");
            System.out.println("Ignoring their questions, you knocked out the remaining thugs.");
            System.out.println("You looked around and the farmer was nowhere to be seen.");
          }
          else
          {
            System.out.println("You accepted their challenge and all the thugs engaged you at once.");
            System.out.println("Your physical abilities were no match for them. Your neck got snapped and your body was left for the crows.");
            gameOver();
          }
        }
      }
      
      System.out.println("");
      System.out.println("You continued on your merry way.");
      System.out.println("After traveling for some time, you spotted a temple off to the side off the road.");
      System.out.println("");
      System.out.println("Do you want to get closer look at the temple? \n A) Yes \n B) No.");
      String temple = r.nextLine();
      
      while (!(temple.equalsIgnoreCase("A") || temple.equalsIgnoreCase("B")))
      {
        wrongChoice();
        System.out.println("Do you want to get closer look at the temple? \n A) Yes \n B) No.");
        temple = r.nextLine();
        System.out.println("");
      }
   
      if (temple.equalsIgnoreCase("A"))
      {
        System.out.println("You went toward the temple to get a closer look at it.");
        System.out.println("The temple looked run down and you see two guards standing at the entrance of the temple.");
        System.out.println("");
        System.out.println("You walked up to the guards. They spotted you and shouted:");
        System.out.println("\"Who are you?\" They unsheated their swords.");
        System.out.println("");
        System.out.println("What do you do? \n A) Explain that you're curious about the temple \n B) Try to fight them with your" + 
                           " bare fist because you forgot to bring a weapon \n C) Stare at them");
        if (human.showKnowsMagic() == true)
         System.out.println(" D) Blast them with magic.");
        String templeGuard = r.nextLine();
        
        while (!(templeGuard.equalsIgnoreCase("A") || templeGuard.equalsIgnoreCase("B") || templeGuard.equalsIgnoreCase("C") || templeGuard.equalsIgnoreCase("D")))
        
        {
          wrongChoice();
          System.out.println("What do you do? \n A) Explain that you're curious about the temple \n B) Try to fight them with your" + 
                             " bare fist because you forgot to bring a weapon \n C) Stare at them");
        if (human.showKnowsMagic() == true)
        System.out.println(" D) Blast them with magic.");
        System.out.println("");
        templeGuard = r.nextLine();
        }
        
        if (templeGuard.equalsIgnoreCase("A")) 
        { 
          System.out.println("You explained that you were curious and just wanted to take a look.");
          System.out.println("The temple guards sheathed their swords and asked you to leave.");
        }
        
        if (templeGuard.equalsIgnoreCase("B"))
        {
          System.out.println("You decided to fight the temple guards unarmed. You are confident of your martial skills.");
          System.out.println("");
          if (Race.showLuck() > 3)
          {
           System.out.println("You must have some quick reflexes as you dodged the temple guard's blades and countered their every moves.");
           System.out.println("After a while, the two guards crumpled to the ground, taking several severe blows to their head.");
           System.out.println("You went into the temple.");
           System.out.println("");
           System.out.println("Suddenly a light blinded you and you feel rejuvenated.");
           human.increaseStr();
           human.increaseAgi();
          }
          else
          {
           System.out.println("Looks like going in unarmed was a dumb idea.");
           System.out.println("The guards cutted your arm off when you tried to block their attack.");
           System.out.println("As you howled with pain, your head got cleanly cutted off.");
           gameOver();
          }
        }
        
        if (templeGuard.equalsIgnoreCase("C"))
        {
         System.out.println("You stared at them and they stared back.");
         System.out.println("After an hour of staring, the guards grew bored and stabbed you through the groin.");
         System.out.println("The pain was so bad, that you grew unconscious and finally died of blood loss.");
         gameOver();
        }
        
        if (templeGuard.equalsIgnoreCase("D"))
        {
         System.out.println("You conjured up pure energy and released it on the guards before they could react.");
         System.out.println("They immediately got incinerated.");
         System.out.println("You went into the temple.");
         System.out.println("");
         System.out.println("Suddenly a light blinded you and you feel rejuvenated.");
         human.increaseStr();
         human.increaseAgi();
        }
        
       System.out.println(human.toString());
       System.out.println("");
       System.out.println("You got away from the temple and onto the main road.");
       }
      
      System.out.println("You continued along on the main road.");
      System.out.println("");
      System.out.println("As you were traveling, the clouds grew dark and suddenly there was a huge storm.");
      
      if (Race.showLuck() == 1)
      {
        System.out.println("Seems like your luck was terrible as a lightning directly striked you.");
        human.decreaseIntel(2);
        System.out.println("The lightnight strike affected your brain and you got a lower IQ than before.");
        System.out.print("");
      }
      
      System.out.println("You see the Citadel of Aigo up ahead and ran toward the gates.");
      System.out.println("");
      System.out.println("You arrived at the gates and was admitted into the citadel.");
      System.out.println("You booked a room in the citadel and went off to sleep, tired from your journey.");
      System.out.println("");
      System.out.println("At the break of daylight, you were waked up by shouts of an attack.");
      System.out.println("A citadel guard broke through your room and told you to get to the citadel gates as soon as you can.");
      System.out.println("You rushed from your room and arrived at the gates.");
      System.out.println("The citadel's lord was telling all capable adventurers to armed themselves and prepare for an attack against a horde of beasts.");
      System.out.println("A sergeant walked up to you and asked for you to choose a weapon.");
      System.out.println("");
      System.out.println("What weapon do you choose? \n A) Generic Sword & Shield \n B) Two-handed Axe \n C) Dual-Wielding Swords");
      String weapon = r.nextLine();
      
      while (!(weapon.equalsIgnoreCase("A") || weapon.equalsIgnoreCase ("B") || weapon.equalsIgnoreCase ("C")))
      {
        wrongChoice();
        System.out.println("What weapon do you choose? \n A) Generic Sword & Shield \n B) Two-handed Axe \n C) Dual-Wielding Swords");
        weapon = r.nextLine();
      }
      
      if (weapon.equalsIgnoreCase("A"))
      {
        human.increaseStr();
        human.increaseAgi();
      } else if (weapon.equalsIgnoreCase("B"))
        {
          human.increaseStr(2);
        } else
          {
            human.increaseAgi(2);
          }
        
      System.out.println(human.toString());
      System.out.println("");
      System.out.println("You chose your weapon and rushed out to fight the beasts along with other adventurers.");
      double skillCombined = Math.abs(Math.sqrt(Math.pow(human.showStr() + human.showAgi() + human.showIntel(), 2)));
      System.out.println("Your first opponent is a rabid wolf.");
      System.out.println("");
      
      if (skillCombined >= 11)
      {
        if ((human.showStr() >= human.showAgi()) && (human.showStr() >= human.showIntel()))
          System.out.println("With your brute strength, you decapitated the wolf in one clean hit.");
        else if ((human.showAgi() >= human.showStr()) && (human.showAgi() >= human.showIntel()))
          System.out.println("With your quick agility, you dodged the wolf's bite and sliced its throat instantly killing the wolf.");
        else
          System.out.println("You used your magic and incinerated the wolf.");
      }
      else
      {
        System.out.println("Your skills were not sufficient enough and your throat got ripped out by the wolf's attack.");
        gameOver();
      }
      
      System.out.println("");
      System.out.println("After finishing off the wolf, you charged into the main area of battle.");
      System.out.println("You spot a manticore slashing through the ranks of the defending adventurers.");
      System.out.println("");
      System.out.println("Do you retreat to the citadel or fight the manticore? \n A) Retreat \n B) Fight");
      String manticore = r.nextLine();
      
      while (!(manticore.equalsIgnoreCase("A") || manticore.equalsIgnoreCase("B")))
      {
       wrongChoice();
       System.out.println("Do you retreat to the citadel or fight the manticore? \n A) Retreat \n B) Fight");
       manticore = r.nextLine();
      }
      if (manticore.equalsIgnoreCase("A"))
        retreat();
      
      System.out.println("");
      System.out.println("You and a few other adventurers ready yourselves to fight the manticore."); 
      System.out.println("Your allies are a bow wielding elf, a fully armored human knight with a longsword, and a lightly armored citadel guard with a sword and board.");
      System.out.println("");
      System.out.println("Do you attempt to take control of the group? \n A) Yes \n B) No");
      System.out.println("");
      String control = r.nextLine();
      
      while (!(control.equalsIgnoreCase("A") || control.equalsIgnoreCase("B")))
      {
        wrongChoice();
        System.out.println("Do you attempt to take control of the group? \n A) Yes \n B) No");
        control = r.nextLine();
      }
      
      if (control.equalsIgnoreCase("A"))
      {
        System.out.println("You decided to convince the group to follow your lead.");
        System.out.println("You shouted to the group to obey your commands so you can defeat the manticore.");
        System.out.println("The knight sneered at you and asked that you prove your worth in battle before they would follow you.");
        System.out.println("");
      }
      
        System.out.println("The manticore striked at you with its claws.");
        if (human.showAgi() < 4)
        {
          System.out.println("");
          System.out.println("You were not quick enough and the manticore's claws ripped through your body.");
          System.out.println("You died choking on your own blood.");
          gameOver();
        }
        else
        {
          System.out.println("");
          System.out.println("You dodged the manticore's claws.");
        }
   
        if (human.showKnowsMagic() == true)
        {
        System.out.println("You released pure energy onto the manticore, scoring a hit on its eyes.");
        System.out.println("The manticore roared in pain, blind from the attack.");
        System.out.println("");
        System.out.println("The group of adventurers were impressed and asked that you lead them.");
        System.out.println("Before you could say anything, the manticore exhaled fire on you and the group, incinerating the knight and the elf.");
        System.out.println("You leaped out of the way in time and the citadel guard blocked the fire with his shield.");
        System.out.println("");
        System.out.println("What do you tell the citadel guard to do? \n A) Distract the manticore \n B) Attack the manticore \n C) To stay out of your way");
        String command = r.nextLine();
        
        while (!(command.equalsIgnoreCase("A") || command.equalsIgnoreCase("B") || command.equalsIgnoreCase("C")))
        {
          wrongChoice();
          System.out.println("What do you tell the citadel guard to do? \n A) Distract the manticore \n B) Attack the manticore \n C) To stay out of your way");
          command = r.nextLine();
        }
        
          if (command.equalsIgnoreCase("A"))
          {
            System.out.println("You told the guard to distract the manticore.");
            System.out.println("The guard shouted and taunted the manticore and lead it around in a circle.");
            System.out.println("You blasted magic at the manticore, burning several areas of its skin.");
            System.out.println("The distracting guard got tired and the manticore ripped off his head with its teeth.");
            System.out.println("");
            System.out.println("The manticore turned around and is now coming for you!");
            System.out.println("");
            if (human.showIntel() >= 8 && human.showAgi() >= 5)
            {
              System.out.println("As the manticore rush towards you, you realized its weakness.");
              System.out.println("You ran toward the manticore and as both of you were about to collide into each other, you jumped up and stabbed the manticore through its eyes.");
              System.out.println("The blade pierced the manticore's eyes and brains, instantly killing it.");
              won();
            }
            else
            {
              System.out.println("You hopelessly blasted energy after energy onto the manticore.");
              System.out.println("The manticore ignored the attacks and decapitated you with its claws.");
              gameOver();
            }
          }
          
          if (command.equalsIgnoreCase("B"))
          {
            System.out.println("You told the guard to attack the manticore.");
            System.out.println("The guard shouted and charged the manticore.");
            System.out.println("While the guard stabbed at the manticore, you blasted magic at the manticore, burning several areas of its skin.");
            System.out.println("After a while, the guard got tired and the manticore ripped off his head with its teeth.");
            System.out.println("");
            System.out.println("The manticore turned around and is now coming for you!");
            System.out.println("");
            if (human.showIntel() >= 8 && human.showAgi() >= 5)
            {
              System.out.println("As the manticore rush towards you, you realized its weakness.");
              System.out.println("You ran toward the manticore and as both of you were about to collide into each other, you jumped up and stabbed the manticore through its eyes.");
              System.out.println("The blade pierced the manticore's eyes and brains, instantly killing it.");
              won();
            }
            else
            {
              System.out.println("You hopelessly blasted energy after energy onto the manticore.");
              System.out.println("The manticore ignored the attacks and decapitated you with its claws.");
              gameOver();
            }
          }
          
          if (command.equalsIgnoreCase("C"))
          {
            System.out.println("You told the guard to stay out of your way.");
            System.out.println("The guard ran back to the citadel.");
            System.out.println("The manticore is now coming for you!");
            System.out.println("");
            if (human.showIntel() >= 8 && human.showAgi() >= 5)
            {
              System.out.println("As the manticore rush towards you, you realized its weakness.");
              System.out.println("You ran toward the manticore and as both of you were about to collide into each other, you jumped up and stabbed the manticore through its eyes.");
              System.out.println("The blade pierced the manticore's eyes and brains, instantly killing it.");
              won();
            }
            else
            {
              System.out.println("You hopelessly blasted energy after energy onto the manticore.");
              System.out.println("The manticore ignored the attacks and decapitated you with its claws.");
              gameOver();
            }
           }
          }
        else
        {
          System.out.println("You counter-attacked and stabbed the manticore's claws.");
          System.out.println("The manticore's claw must've been made out of rock as your blade bounced off without making so much a scratch."); 
          System.out.println("The knight laughed at you and said \"Watch how it is done, weakling.\" ");
          System.out.println("");
          System.out.println("The knight charged into the manticore and slashed at its head with his longsword.");
          System.out.println("The knight got swatted away and the manticore is undamaged.");
          System.out.println("Meanwhile, the elf is shooting the manticore with her bow.");
          System.out.println("This too does no effect to the manticore.");
          System.out.println("");
          System.out.println("What do you do? \n A) Repeatedly attack the manticore \n B) Tell everyone to attack at once \n C) Try to run away \n D) Try to see if the manticore have a weakness");
          String manticoreA = r.nextLine();
          
          while (!(manticoreA.equalsIgnoreCase("A") || manticoreA.equalsIgnoreCase("B") || manticoreA.equalsIgnoreCase("C") || manticoreA.equalsIgnoreCase("D")))
          {
            wrongChoice();
            System.out.println("What do you do? \n A) Repeatedly attack the manticore \n B) Tell everyone to attack at once \n C) Try to run away \n D) Try to see if the manticore have a weakness");
            manticoreA = r.nextLine();
          }
          
          if (manticoreA.equalsIgnoreCase("A"))
          {
            System.out.println("You repeatedly attack the manticore, hoping by some miracle that you'll be able to injure it.");
            System.out.println("");
            if (human.showStr() >= 7)
            {
              System.out.println("You feel your muscles expanding as your blade finally cleave through the manticore's hind legs.");
              System.out.println("With a roar, the manticore flew away, its wings flapping through the air.");
              won2();
            }
            else
            {
              System.out.println("Despite your best efforts, it was no use.");
              System.out.println("The blade kept bouncing off the manticore and you were finally stabbed by the manticore's claws.");
              gameOver();
            }
          }
          
          if (manticoreA.equalsIgnoreCase("B"))
          {
            System.out.println("You told everyone to attack the manticore at once.");
            System.out.println("Everyone charged at the manticore and were incinerated by the fire exhaled by the manticore, yourself included.");
            gameOver();
          }
          
          if (manticoreA.equalsIgnoreCase("C"))
          {
            System.out.println("You decide to run away while the other adventurers were distracting the manticore.");
            System.out.println("");
            System.out.println("Where do you run to? \n A) Back to the citadel \n B) Into the nearby forest");
            String run = r.nextLine();
            while (!(run.equalsIgnoreCase("A") || run.equalsIgnoreCase("B")))
            {
              wrongChoice();
              System.out.println("Where do you run to? \n A) Back to the citadel \n B) Into the nearby forest");
              run = r.nextLine();
            }
            if (run.equalsIgnoreCase("A"))
            {
              System.out.println("You tried to run back to the citadel but the manticore, already slaughtered the adventurers, intercepted you.");
              System.out.println("You are forced to attack the manticore, hoping by some miracle that you'll be able to injure it.");
              System.out.println("");
            
              if (human.showStr() >= 7)
              {
              System.out.println("You feel your muscles expanding as your blade finally cleave through the manticore's hind legs.");
              System.out.println("With a roar, the manticore flew away, its wings flapping through the air.");
              won2();
              }
              else
              {
              System.out.println("Despite your best efforts, it was no use.");
              System.out.println("The blade kept bouncing off the manticore and you were finally stabbed by the manticore's claws.");
              gameOver();
              }
            }
            if (run.equalsIgnoreCase("B"))
            {
              System.out.println("You ran to the nearby forest, and crashed through the trees.");
              System.out.println("You ran until you can run no more.");
              System.out.println("");
              System.out.println("Tired, you laid down on a nearby log and fell asleep.");
              System.out.println("");
              System.out.println("You wake up to find an elf shouting at you in a language you don't understand.");
              System.out.println("He offered you some mushrooms and gestured for you to eat it.");
              System.out.println("");
              System.out.println("Do you eat the mushrooms? \n A) Yes \n B) No");
              String mushroom = r.nextLine();
              while (!(mushroom.equalsIgnoreCase("A") || mushroom.equalsIgnoreCase("B")))
              {
                wrongChoice();
                System.out.println("Do you eat the mushrooms? \n A) Yes \n B) No");
                mushroom = r.nextLine();
              }
              if (mushroom.equalsIgnoreCase("A"))
              {
                System.out.println("You accept the mushrooms and ate it greedily.");
                System.out.println("You suddenly feel dizzy and blacked out.");
                System.out.println("");
                System.out.println("You woke up and find yourself in a cage.");
                System.out.println("Your hands are bonded together by a rope.");
                System.out.println("You look out the cage and see elves taking away a burnt body from a bonfire.");
                System.out.println("");
                System.out.println("Looks like you'll be their next sacrafice!");
                gameOver();
              }
              if (mushroom.equalsIgnoreCase("B"))
              {
                System.out.println("You refused the mushrooms.");
                System.out.println("The elf grunted and seemingly disappeared into the surroundings.");
                System.out.println("You got up and tried to leave the forest.");
                System.out.println("You wandered around for days or maybe weeks.");
                System.out.println("You don't know as the sun seems to shine on forever.");
                System.out.println("");
                System.out.println("What you do know is that you are in a forest, lost without hope.");
                System.out.println("The birds chirp forever and you have a sore headache.");
                System.out.println("You became insane and slowly turned into a crazed hermit, doomed to wander the forest forver.");
                gameOver();
              }
            }
          }
          
          if (manticoreA.equals("D"))
          {
            System.out.println("You rack your brain to think of a weakness the manticore might have.");
            System.out.println("");
            if (human.showIntel() >= 8 && human.showAgi() >= 5)
            {
              System.out.println("As the manticore rush towards you, you realized its weakness.");
              System.out.println("You ran toward the manticore and as both of you were about to collide into each other, you jumped up and stabbed the manticore through its eyes.");
              System.out.println("The blade pierced the manticore's eyes and brains, instantly killing it.");
              won();
            }
            else
            {
              System.out.println("Unfortunately, you're not smart enough to know if the manticore has a weakness.");
              System.out.println("While you were thinking hard, the manticore reached you before you can think up of anything and decapitated you with its claws.");
              gameOver();
            }
          }
       }
    }
    
    if (race.equalsIgnoreCase("B")) //Elf Path
    {
      Race elf = new Race(3, 6, 6, true);
      System.out.println("");
      System.out.println("Would you like to test your luck in order to max your skills?(Cheat mode) \n Enter A for yes. If not, enter not A.");
      System.out.println("");
      String cheat = r.nextLine();
      
      if (cheat.equalsIgnoreCase("A"))
      {
        int chance = (int)(Math.random() * 100);
        System.out.println("");
        if (chance > 95)
        {
          elf.setCheat();
          System.out.println("Congrats. The fantasy gods must've been on your side as your skills are now maxed.");
          System.out.println("");
        } 
        else
        {
          System.out.println("Aw too bad. Your skills were not maxed. Looks like the fantasy gods are not on your side. Maybe next time when you decided to try again.");
          System.out.println("");
        }
      }
      
      System.out.println("You are an elf, born in the woodlands of Lathel Oren.");
      System.out.println("Your father was a waywatcher, guarding the main path that goes through Lathel Oren.");
      System.out.println("Your mother worked as a forager, collecting edible plants and roots in the woodlands. She took care of you and the home you lived in.");
      System.out.println("You experienced a life full of war growing up and when you turn 95(start of elven adulthood), you decided to get a job that would enable you to defend your homeland.");
      System.out.println("");
      System.out.println("What job do you choose? \n A) Deepwood Scout \n B) Eternal Guard \n C) Spellsinger");
      String job = r.nextLine();
      
      while (!(job.equalsIgnoreCase("A") || job.equalsIgnoreCase("B") || job.equalsIgnoreCase("C")))
      {
        wrongChoice();
        System.out.println("What job do you choose? \n A) Deepwood Scout \n B) Eternal Guard \n C) Spellsinger");
        job = r.nextLine();
      }
      
      if (job.equalsIgnoreCase("A"))
      {
        System.out.println("As a deepwood scout, your job is to patrol the woodland in search of unwelcome guests.");
        System.out.println("For 20 years, you sneak through the forests and one-shot leaders of invading forces looking to do harm against you and your kin.");
        System.out.println("");
        System.out.println("One night during your daily patrol, you accidentally shot one of your elven kin.");
        System.out.println("You were banished that day and you set out to become an adventurer.");
        elf.increaseAgi();
      }
      
      else if (job.equalsIgnoreCase("B"))
      {
        System.out.println("As an eternal guard, your job is to protect the king of Lathel Oren.");
        System.out.println("Lathel Oren, while constantly at war, is very protective of its king and the capital where he resided.");
        System.out.println("Layers of defence surround the capital and so no invading army ever reached the capital.");
        System.out.println("What this means for you is that you never experienced any fighting as an eternal guard.");
        System.out.println("");
        System.out.println("During your service, you sparred with other eternal guards and elven recruits.");
        System.out.println("Feeling restless, you terminated your service and set out to become an adventurer.");
        elf.increaseStr();
      }
      
      else
      {
        System.out.println("As a spellsinger, you are dedicated to the art of magic.");
        System.out.println("For a century, you learned every single kind of magic known in the elven world.");
        System.out.println("");
        System.out.println("Every millineum, there is a competition, in which every spellsingers can compete in, to become head spellsinger, a spellweaver.");
        System.out.println("You entered into this competition along with 15 other spellsingers.");
        System.out.println("Unfortunately, you came out dead last in the competition.");
        System.out.println("You were ridiculated by every elf in Lathel Oren and were banished from Lathel Oren.");
        System.out.println("Your only option now is to become an adventurer and so you set out to become just that.");
        elf.increaseIntel();
      }
      
      System.out.println(elf.toString());
      System.out.println("");
      System.out.println("You reached the border of the woodlands and spotted a group of beasts attacking two waywatchers.");
      System.out.println("");
      System.out.println("What do you do?: \n A) Go in swinging \n B) Slip past them and continue on your way" + 
                         "\n C) Blast them with magic");
      String border = r.nextLine();
      
      while (!(border.equalsIgnoreCase("A") || border.equalsIgnoreCase("B") || border.equalsIgnoreCase("C")))
      {
        wrongChoice();
        System.out.println ("What do you do?: \n A) Go in swinging \n B) Ignore them and continue on your way" + 
                         "\n C) Blast them with magic");
        border = r.nextLine();
      }
      
      if (border.equalsIgnoreCase("A"))
      {
        System.out.println("");
        System.out.println("You went in swinging and smacking the attacking beasts.");
        if (elf.showStr() >= 4)
        {
          System.out.println("You and the waywatchers successfully beat back the beasts.");
          System.out.println("They thanked you for your help and offered you a purple potion which they claim will increase your speed.");
          System.out.println("You accepted it and drank it down.");
          System.out.println("To your amazement, you feel your legs getting buffer.");
          elf.increaseAgi();
        }
        else
        {
          System.out.println("You were too weak and the beasts bit your limbs off.");
          System.out.println("You and the waywatchers were eaten alive due to your incompetence.");
          gameOver();
        }
      }
      
      if (border.equalsIgnoreCase("C"))
      {
          System.out.println("");         
          System.out.println("You conjured up pure energy and released it on the group.");
          System.out.println("The group immediately got incinerated, including the waywatchers. Looks like you underestimated your power."); 
      }
      
      System.out.println("");
      System.out.println("You exited the woodlands that you so dear love and with a heavy heart, you set out onto the main road.");
      System.out.println("After traveling for some time, you spotted a temple off to the side off the road.");
      System.out.println("");
      System.out.println("Do you want to get closer look at the temple? \n A) Yes \n B) No.");
      String temple = r.nextLine();
      
      while (!(temple.equalsIgnoreCase("A") || temple.equalsIgnoreCase("B")))
      {
        wrongChoice();
        System.out.println("Do you want to get closer look at the temple? \n A) Yes \n B) No.");
        temple = r.nextLine();
        System.out.println("");
      }
      
      if (temple.equalsIgnoreCase("A"))
      {
        System.out.println("You went toward the temple to get a closer look at it.");
        System.out.println("The temple looked run down and you see two human guards standing at the entrance of the temple.");
        System.out.println("");
        System.out.println("You walked up to the guards. They spotted you and shouted:");
        System.out.println("\"Who are you?\" They unsheated their swords.");
        System.out.println("");
        System.out.println("What do you do? \n A) Explain that you're curious about the temple \n B) Try to fight them with your" + 
                           " bare fist because you forgot to bring a weapon \n C) Stare at them \n D) Blast them with magic");
        String templeGuard = r.nextLine();
        while (!(templeGuard.equalsIgnoreCase("A") || templeGuard.equalsIgnoreCase("B") || templeGuard.equalsIgnoreCase("C") || templeGuard.equalsIgnoreCase("D")))
        {
          wrongChoice();
          System.out.println("What do you do? \n A) Explain that you're curious about the temple \n B) Try to fight them with your" + 
                             " bare fist because you forgot to bring a weapon \n C) Stare at them");
        System.out.println("");
        templeGuard = r.nextLine();
        }
        if (templeGuard.equalsIgnoreCase("A"))
        { 
          System.out.println("You explained that you were curious and just wanted to take a look.");
          System.out.println("The temple guards sheathed their swords and asked you to leave.");
        }
        if (templeGuard.equalsIgnoreCase("B"))
        {
          System.out.println("You decided to fight the temple guards unarmed. You are confident of your martial skills.");
          System.out.println("");
          if (Race.showLuck() > 3)
          {
           System.out.println("You must have some quick reflexes as you dodged the temple guard's blades and countered their every moves.");
           System.out.println("After a while, the two guards crumpled to the ground, taking several severe blows to their head.");
           System.out.println("You went into the temple.");
           System.out.println("");
           System.out.println("Suddenly a light blinded you and you feel rejuvenated.");
           elf.increaseStr();
           elf.increaseAgi();
          }
          else
          {
           System.out.println("Looks like going in unarmed was a dumb idea.");
           System.out.println("The guards cutted your arm off when you tried to block their attack.");
           System.out.println("As you howled with pain, your head got cleanly cutted off.");
           gameOver();
          }
        }
        
       if (templeGuard.equalsIgnoreCase("C"))
       {
         System.out.println("You stared at them and they stared back.");
         System.out.println("After an hour of staring, the guards grew bored and stabbed you through the groin.");
         System.out.println("The pain was so bad, that you grew unconscious and finally died of blood loss.");
         gameOver();
       }
       
       if (templeGuard.equalsIgnoreCase("D"))
       {
         System.out.println("You conjured up pure energy and released it on the guards before they could react.");
         System.out.println("They immediately got incinerated.");
         System.out.println("You went into the temple.");
         System.out.println("");
         System.out.println("Suddenly a light blinded you and you feel rejuvenated.");
         elf.increaseStr();
         elf.increaseAgi();
       }
       System.out.println("");
       System.out.println(elf.toString());
       System.out.println("");
       System.out.println("You got away from the temple and onto the main road.");
       }
      
      System.out.println("You continued along on the main road.");
      System.out.println("");
      System.out.println("As you were traveling, the clouds grew dark and suddenly there was a huge storm.");
      if (Race.showLuck() == 1)
      {
        System.out.println("Seems like your luck was terrible as a lightning directly striked you.");
        elf.decreaseIntel(2);
        System.out.println("The lightnight strike affected your brain and you got a lower IQ than before.");
        System.out.print("");
      }
      System.out.println("You see the Citadel of Aigo up ahead and ran toward the gates.");
      System.out.println("");
      System.out.println("You arrived at the gates and was admitted into the citadel.");
      System.out.println("You booked a room in the citadel and went off to sleep, tired from your journey.");
      System.out.println("");
      System.out.println("At the break of daylight, you were waked up by shouts of an attack.");
      System.out.println("A citadel guard broke through your room and told you to get to the citadel gates as soon as you can.");
      System.out.println("You rushed from your room and arrived at the gates.");
      System.out.println("The citadel's lord was telling all capable adventurers to armed themselves and prepare for an attack against a horde of beasts.");
      System.out.println("A sergeant walked up to you and asked for you to choose a weapon.");
      System.out.println("");
      System.out.println("What weapon do you choose? \n A) Generic Sword & Shield \n B) Two-handed Axe \n C) Dual-Wielding Swords");
      String weapon = r.nextLine();
      
      while (!(weapon.equalsIgnoreCase("A") || weapon.equalsIgnoreCase ("B") || weapon.equalsIgnoreCase ("C")))
      {
        wrongChoice();
        System.out.println("What weapon do you choose? \n A) Generic Sword & Shield \n B) Two-handed Axe \n C) Dual-Wielding Swords");
        weapon = r.nextLine();
      }
      
      if (weapon.equalsIgnoreCase("A"))
      {
        elf.increaseStr();
        elf.increaseAgi();
      } else if (weapon.equalsIgnoreCase("B"))
        {
          elf.increaseStr(2);
        } else
          {
            elf.increaseAgi(2);
          }
        
      System.out.println(elf.toString());
      System.out.println("");
      System.out.println("You chose your weapon and rushed out to fight the beasts along with other adventurers.");
      double skillCombined = Math.abs(Math.sqrt(Math.pow(elf.showStr() + elf.showAgi() + elf.showIntel(), 2)));
      System.out.println("Your first opponent is a rabid wolf.");
      System.out.println("");
      if (skillCombined >= 11)
      {
        if ((elf.showStr() >= elf.showAgi()) && (elf.showStr() >= elf.showIntel()))
          System.out.println("With your brute strength, you decapitated the wolf in one clean hit.");
        else if ((elf.showAgi() >= elf.showStr()) && (elf.showAgi() >= elf.showIntel()))
          System.out.println("With your quick agility, you dodged the wolf's bite and sliced its throat instantly killing the wolf.");
        else
          System.out.println("You used your magic and incinerated the wolf.");
      }
      else
      {
        System.out.println("Your skills were not sufficient enough and your throat got ripped out by the wolf's attack.");
        gameOver();
      }
      
      System.out.println("");
      System.out.println("After finishing off the wolf, you charged into the main area of battle.");
      System.out.println("You spot a manticore slashing through the ranks of the defending adventurers.");
      System.out.println("");
      System.out.println("Do you retreat to the citadel or fight the manticore? \n A) Retreat \n B) Fight");
      String manticore = r.nextLine();
      
      while (!(manticore.equalsIgnoreCase("A") || manticore.equalsIgnoreCase("B")))
      {
       wrongChoice();
       System.out.println("Do you retreat to the citadel or fight the manticore? \n A) Retreat \n B) Fight");
       manticore = r.nextLine();
      }
      
      if (manticore.equalsIgnoreCase("A"))
        retreat();
      System.out.println("");
      System.out.println("You and a few other adventurers ready yourselves to fight the manticore."); 
      System.out.println("Your allies are a bow wielding elf, a fully armored human knight with a longsword, and a lightly armored citadel guard with a sword and board.");
      System.out.println("");
      System.out.println("Do you attempt to take control of the group? \n A) Yes \n B) No");
      System.out.println("");
      String control = r.nextLine();
      
      while (!(control.equalsIgnoreCase("A") || control.equalsIgnoreCase("B")))
      {
        wrongChoice();
        System.out.println("Do you attempt to take control of the group? \n A) Yes \n B) No");
        control = r.nextLine();
      }
      
      if (control.equalsIgnoreCase("A"))
      {
        System.out.println("You decided to convince the group to follow your lead.");
        System.out.println("You shouted to the group to obey your commands so you can defeat the manticore.");
        System.out.println("The knight sneered at you and asked that you prove your worth in battle before they would follow you.");
        System.out.println("");
      }
        System.out.println("The manticore striked at you with its claws.");
        if (elf.showAgi() < 4)
        {
          System.out.println("");
          System.out.println("You were not quick enough and the manticore's claws ripped through your body.");
          System.out.println("You died choking on your own blood.");
          gameOver();
        }
        else
        {
          System.out.println("");
          System.out.println("You dodged the manticore's claws.");
        }
        if (elf.showKnowsMagic() == true)
        {
        System.out.println("You released pure energy onto the manticore, scoring a hit on its eyes.");
        System.out.println("The manticore roared in pain, blind from the attack.");
        System.out.println("");
        System.out.println("The group of adventurers were impressed and asked that you lead them.");
        System.out.println("Before you could say anything, the manticore exhaled fire on you and the group, incinerating the knight and the elf.");
        System.out.println("You leaped out of the way in time and the citadel guard blocked the fire with his shield.");
        System.out.println("");
        System.out.println("What do you tell the citadel guard to do? \n A) Distract the manticore \n B) Attack the manticore \n C) To stay out of your way");
        String command = r.nextLine();
        
        while (!(command.equalsIgnoreCase("A") || command.equalsIgnoreCase("B") || command.equalsIgnoreCase("C")))
        {
          wrongChoice();
          System.out.println("What do you tell the citadel guard to do? \n A) Distract the manticore \n B) Attack the manticore \n C) To stay out of your way");
          command = r.nextLine();
        }
        
          if (command.equalsIgnoreCase("A"))
          {
            System.out.println("You told the guard to distract the manticore.");
            System.out.println("The guard shouted and taunted the manticore and lead it around in a circle.");
            System.out.println("You blasted magic at the manticore, burning several areas of its skin.");
            System.out.println("The distracting guard got tired and the manticore ripped off his head with its teeth.");
            System.out.println("");
            System.out.println("The manticore turned around and is now coming for you!");
            System.out.println("");
            if (elf.showIntel() >= 8 && elf.showAgi() >= 5)
            {
              System.out.println("As the manticore rush towards you, you realized its weakness.");
              System.out.println("You ran toward the manticore and as both of you were about to collide into each other, you jumped up and stabbed the manticore through its eyes.");
              System.out.println("The blade pierced the manticore's eyes and brains, instantly killing it.");
              won();
            }
            else
            {
              System.out.println("You hopelessly blasted energy after energy onto the manticore.");
              System.out.println("The manticore ignored the attacks and decapitated you with its claws.");
              gameOver();
            }
          }
          
          if (command.equalsIgnoreCase("B"))
          {
            System.out.println("You told the guard to attack the manticore.");
            System.out.println("The guard shouted and charged the manticore.");
            System.out.println("While the guard stabbed at the manticore, you blasted magic at the manticore, burning several areas of its skin.");
            System.out.println("After a while, the guard got tired and the manticore ripped off his head with its teeth.");
            System.out.println("");
            System.out.println("The manticore turned around and is now coming for you!");
            System.out.println("");
            if (elf.showIntel() >= 8 && elf.showAgi() >= 5)
            {
              System.out.println("As the manticore rush towards you, you realized its weakness.");
              System.out.println("You ran toward the manticore and as both of you were about to collide into each other, you jumped up and stabbed the manticore through its eyes.");
              System.out.println("The blade pierced the manticore's eyes and brains, instantly killing it.");
              won();
            }
            else
            {
              System.out.println("You hopelessly blasted energy after energy onto the manticore.");
              System.out.println("The manticore ignored the attacks and decapitated you with its claws.");
              gameOver();
            }
          }
          
          if (command.equalsIgnoreCase("C"))
          {
            System.out.println("You told the guard to stay out of your way.");
            System.out.println("The guard ran back to the citadel.");
            System.out.println("The manticore is now coming for you!");
            System.out.println("");
            if (elf.showIntel() >= 8 && elf.showAgi() >= 5)
            {
              System.out.println("As the manticore rush towards you, you realized its weakness.");
              System.out.println("You ran toward the manticore and as both of you were about to collide into each other, you jumped up and stabbed the manticore through its eyes.");
              System.out.println("The blade pierced the manticore's eyes and brains, instantly killing it.");
              won();
            }
            else
            {
              System.out.println("You hopelessly blasted energy after energy onto the manticore.");
              System.out.println("The manticore ignored the attacks and decapitated you with its claws.");
              gameOver();
            }
           }
          }
        
        else
        {
          System.out.println("You counter-attacked and stabbed the manticore's claws.");
          System.out.println("The manticore's claw must've been made out of rock as your blade bounced off without making so much a scratch."); 
          System.out.println("The knight laughed at you and said \"Watch how it is done, weakling.\" ");
          System.out.println("");
          System.out.println("The knight charged into the manticore and slashed at its head with his longsword.");
          System.out.println("The knight got swatted away and the manticore is undamaged.");
          System.out.println("Meanwhile, the elf is shooting the manticore with her bow.");
          System.out.println("This too does no effect to the manticore.");
          System.out.println("");
          System.out.println("What do you do? \n A) Repeatedly attack the manticore \n B) Tell everyone to attack at once \n C) Try to run away \n D) Try to see if the manticore have a weakness");
          String manticoreA = r.nextLine();
          
          while (!(manticoreA.equalsIgnoreCase("A") || manticoreA.equalsIgnoreCase("B") || manticoreA.equalsIgnoreCase("C") || manticoreA.equalsIgnoreCase("D")))
          {
            wrongChoice();
            System.out.println("What do you do? \n A) Repeatedly attack the manticore \n B) Tell everyone to attack at once \n C) Try to run away \n D) Try to see if the manticore have a weakness");
            manticoreA = r.nextLine();
          }
          
          if (manticoreA.equalsIgnoreCase("A"))
          {
            System.out.println("You repeatedly attack the manticore, hoping by some miracle that you'll be able to injure it.");
            System.out.println("");
            if (elf.showStr() >= 7)
            {
              System.out.println("You feel your muscles expanding as your blade finally cleave through the manticore's hind legs.");
              System.out.println("With a roar, the manticore flew away, its wings flapping through the air.");
              won2();
            }
            else
            {
              System.out.println("Despite your best efforts, it was no use.");
              System.out.println("The blade kept bouncing off the manticore and you were finally stabbed by the manticore's claws.");
              gameOver();
            }
          }
          
          if (manticoreA.equalsIgnoreCase("B"))
          {
            System.out.println("You told everyone to attack the manticore at once.");
            System.out.println("Everyone charged at the manticore and were incinerated by the fire exhaled by the manticore, yourself included.");
            gameOver();
          }
          
          if (manticoreA.equalsIgnoreCase("C"))
          {
            System.out.println("You decide to run away while the other adventurers were distracting the manticore.");
            System.out.println("");
            System.out.println("Where do you run to? \n A) Back to the citadel \n B) Into the nearby forest");
            String run = r.nextLine();
            while (!(run.equalsIgnoreCase("A") || run.equalsIgnoreCase("B")))
            {
              wrongChoice();
              System.out.println("Where do you run to? \n A) Back to the citadel \n B) Into the nearby forest");
              run = r.nextLine();
            }
            if (run.equalsIgnoreCase("A"))
            {
              System.out.println("You tried to run back to the citadel but the manticore, already slaughtered the adventurers, intercepted you.");
              System.out.println("You are forced to attack the manticore, hoping by some miracle that you'll be able to injure it.");
              System.out.println("");
            
              if (elf.showStr() >= 7)
              {
              System.out.println("You feel your muscles expanding as your blade finally cleave through the manticore's hind legs.");
              System.out.println("With a roar, the manticore flew away, its wings flapping through the air.");
              won2();
              }
              else
              {
              System.out.println("Despite your best efforts, it was no use.");
              System.out.println("The blade kept bouncing off the manticore and you were finally stabbed by the manticore's claws.");
              gameOver();
              }
            }
            if (run.equalsIgnoreCase("B"))
            {
              System.out.println("You ran to the nearby forest, and crashed through the trees.");
              System.out.println("You ran until you can run no more.");
              System.out.println("");
              System.out.println("Tired, you laid down on a nearby log and fell asleep.");
              System.out.println("");
              System.out.println("You wake up to find an elf shouting at you in elven language.");
              System.out.println("He offered you some mushrooms and gestured for you to eat it.");
              System.out.println("");
              System.out.println("Do you eat the mushrooms? \n A) Yes \n B) No");
              String mushroom = r.nextLine();
              while (!(mushroom.equalsIgnoreCase("A") || mushroom.equalsIgnoreCase("B")))
              {
                wrongChoice();
                System.out.println("Do you eat the mushrooms? \n A) Yes \n B) No");
                mushroom = r.nextLine();
              }
              if (mushroom.equalsIgnoreCase("A"))
              {
                System.out.println("You accept the mushrooms and ate it greedily.");
                System.out.println("You suddenly feel dizzy and blacked out.");
                System.out.println("");
                System.out.println("You woke up and find yourself in a elven style bedroom.");
                System.out.println("You got up and went into the adjacent room to find an elven family eating brunch.");
                System.out.println("The oldest elf welcomed you and asked they you stay in their home for as long as you like");
                System.out.println("You asked where you are");
                System.out.println("");
                System.out.println("The oldest one replied, \"You are in our house, located in Laurelorn Forest, near the Citadel of Aigo.");
                System.out.println("Laurelorn Forest is welcome to only elves. Any humans who traverse into this forest will be unable to come out due to the magic" +
                                   " surrounding this area.");
                System.out.println("You were tired when we came upon on you and so we offered you mushrooms in order for you to recover.\"");
                System.out.println("");
                System.out.println("You thanked them for their hospitality and left their house.");
                System.out.println("You decided that there was enough adventure in your long elven lifetime and so you settled down in Laurelorn Forest.");
                gameOver();
              }
              if (mushroom.equalsIgnoreCase("B"))
              {
                System.out.println("You refused the mushrooms.");
                System.out.println("The elf grunted and seemingly disappeared into the surroundings.");
                System.out.println("You got up and tried to leave the forest.");
                System.out.println("Thanks to your elven intuition, you were able to exit the forest and see the Citadel of Aigo a few hundred meters away.");
                System.out.println("");
                System.out.println("You decided to continue your days of adventuring for another decade until ultimately, your death came by the hands of a greedy dwarf.");
                System.out.println("The dwarf wanted the huge wealth you accrured during your adventures and so you were stabbed in your sleep.");
                gameOver();
              }
            }
          }
          
          if (manticoreA.equals("D"))
          {
            System.out.println("You rack your brain to think of a weakness the manticore might have.");
            System.out.println("");
            if (elf.showIntel() >= 8 && elf.showAgi() >= 5)
            {
              System.out.println("As the manticore rush towards you, you realized its weakness.");
              System.out.println("You ran toward the manticore and as both of you were about to collide into each other, you jumped up and stabbed the manticore through its eyes.");
              System.out.println("The blade pierced the manticore's eyes and brains, instantly killing it.");
              won();
            }
            else
            {
              System.out.println("Unfortunately, you're not smart enough to know if the manticore has a weakness.");
              System.out.println("While you were thinking hard, the manticore reached you before you can think up of anything and decapitated you with its claws.");
              gameOver();
            }
          }
       }
     }
  }
  
  public static void wrongChoice()
  { System.out.println("Sorry. That's not an option. Remember: Choose the letter for your choice."); }
  
  public static void gameOver()
  {
    System.out.println("");
    System.out.println("Your journey had unfournately come to an end.");
    System.out.println("Enter A if you would like to start over and choose different choices to achieve a different ending.");
    Scanner c = new Scanner(System.in);
    String restart = c.nextLine();
    if (restart.equalsIgnoreCase("A"))
    {
      System.out.println(" \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
      startGame();
    }
    else
    System.out.print("Alright then. Hope you can play again later.");
  }
  
  public static void won()
  {
    System.out.println("");
    System.out.println("You slaughtered the manticore.");
    System.out.println("All civilized races praised you in songs and poems.");
    System.out.println("Your legacy will not be forgotten.");
    gameOver();
  }
  
  public static void won2()
  {
    System.out.println("");
    System.out.println("You had injured the manticore severely. It won't be attacking anymore settlements anytime soon.");
    System.out.println("The inhabitants of Aigo celebrated your return and you became the next lord of the citadel."); 
    gameOver();
  }
  
  public static void retreat ()
  {
    System.out.println("");
    System.out.println("You retreated back to the citadel with a few adventurers.");
    System.out.println("The manticore intercepted you before you reached the gates.");
  }
}

