//*File: madlibs.java
//Authors: Oluwakayikunmi Babatunde - Akinnagbe + Kaothara Morakinyo

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.*;
public class madlibs 
{
    public static void main(String []args)
    {
        System.out.println("Hello, everyone!\nWelcome to AD LIBS!! A game where you enter randoms and we give you a story!\nTo  start, follow the directions below:");
       
        PrintWriter n = null;
        Scanner sin = new Scanner(System.in);
        try
        { //start
            File nn = new File("Nouns.txt");
            n = new PrintWriter(nn);
        }
        catch (Exception ex)
        {
            System.out.println(ex);
        }
        String noun = "";
        while(!noun.equals("done"))
        {
            System.out.println("Enter noun or type done to stop: ");
            noun = sin.nextLine();
            if(!noun.equals("done"))
            {
                System.out.println(noun);            
                n.write(noun + "\n");
            }
        }
        n.close();
        //sin.close();//nouns   
        //Scanner sin = null;
        try
        {
            sin = new Scanner(new File("Nouns.txt"));
        }
        catch(Exception ex)
        {
            System.out.println(ex);
            System.exit(0);
        }
        List<String> N = new ArrayList<>();
        while(sin.hasNext())
        {  
            noun = sin.next();
            N.add(noun);
        }
        System.out.println("Nouns: " + N);//end of nouns
  
        PrintWriter ver = null;
        Scanner vb = new Scanner(System.in);
        try
        { //start
            File vv = new File("Verbs.txt");
            ver = new PrintWriter(vv);
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
        String verb = "";
        while(!verb.equals("done"))
        {
            System.out.println("Enter verb or type done to stop: ");
            verb = vb.nextLine();
            if(!verb.equals("done"))
            {
                System.out.println(verb);            
                ver.write(verb + "\n");
            }
        }
        ver.close();
        //vb.close();//verb   
        //Scanner sin = null;
        try
        {
            sin = new Scanner(new File("Verbs.txt"));
        }catch(Exception ex)
        {
            System.out.println(ex);
            System.exit(0);
        }
        List<String> V = new ArrayList<>();
        while(sin.hasNext())
        {  
            verb = sin.next();
            V.add(verb);
        }
        System.out.println("Verbs: " + V); // end of verbs
  
        PrintWriter b = null;
        Scanner bp = new Scanner(System.in);
        try
        { //start
            File bb = new File("Body.txt");
            b = new PrintWriter(bb);
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
        String body = "";
        while(!body.equals("done"))
        {
            System.out.println("Enter a body part or type done to stop: ");
            body = bp.nextLine();
            if(!body.equals("done"))
            {
                System.out.println(body);            
                b.write(body + "\n");
            }
        }
        b.close();
        //bp.close();//body 
        //Scanner bp = null;
        try
        {
            sin = new Scanner(new File("Body.txt"));
        }catch(Exception ex)
        {
            System.out.println(ex);
            System.exit(0);
        }
        List<String> B = new ArrayList<>();
        while(sin.hasNext())
        {  
            body = sin.next();
            B.add(body);
        }
        System.out.println("Body Parts: " + B);// end of bodyparts
       
       
        PrintWriter fm = null;
        Scanner fam = new Scanner(System.in);
        try
        { //start
            File family = new File("Family.txt");
            fm = new PrintWriter(family);
        } 
        catch(Exception ex)
        {
            System.out.println(ex);
        }
        String fammem = "";
        while(!fammem.equals("done"))
        {
            System.out.println("Enter family member or type done to stop: ");
            fammem = fam.nextLine();
            if(!fammem.equals("done"))
            {
                System.out.println(fammem);            
                fm.write(fammem + "\n");
            }
        }
        fm.close();
        //fam.close();//fam
        //Scanner mem = null;
        try
        {
            sin = new Scanner(new File("Family.txt"));
        }
        catch(Exception ex)
        {
            System.out.println(ex); System.exit(0);
        }
        List<String> F = new ArrayList<>();
        while(sin.hasNext())
        {  
            fammem = sin.next();
            F.add(fammem);
        }
        System.out.println("Family members: " + F); //end of family member
  
        PrintWriter a = null;
        Scanner ain = new Scanner(System.in);
        try
        { //start
            File aa = new File("Animal.txt");
            a = new PrintWriter(aa);
        }
        catch (Exception ex)
        {
            System.out.println(ex);
        }
        String animal = "";
        while(!animal.equals("done"))
        {
            System.out.println("Enter animal or type done to stop: ");
            animal = ain.nextLine();
            if(!animal.equals("done"))
            {
                System.out.println(animal);            
                a.write(animal + "\n");
            }
        }
        a.close();
        //ain.close();//nouns   
        //Scanner min = null;
        try
        {
            sin = new Scanner(new File("Animal.txt"));
        }
        catch(Exception ex)
        {
            System.out.println(ex);
            System.exit(0);
        }
        List<String> A = new ArrayList<>();
        while(sin.hasNext())
        {  
            animal = sin.next();
            A.add(animal);
        }
        System.out.println("Animals: " + A);//end of animal
       
       
        PrintWriter ad = null;
        Scanner adj = new Scanner(System.in);
        try
        { //start
            File adjectives = new File("Adjectives.txt");
            ad = new PrintWriter(adjectives);
        }
        catch (Exception ex)
        {
            System.out.println(ex);
        }
        String adjective = "";
        while(!adjective.equals("done"))
        {
            System.out.println("Enter adjective or type done to stop: ");
            adjective = adj.nextLine();
            if(!adjective.equals("done"))
            {
                System.out.println(adjective);            
                ad.write(adjective + "\n");
            }
        }
       ad.close();
       //adj.close();//adjective   
        //Scanner adjec = null;
        try
        {
            sin = new Scanner(new File("Adjectives.txt"));
        }
        catch(Exception ex)
        {
            System.out.println(ex);
            System.exit(0);
        }
        List<String> Ad = new ArrayList<>();
        while(sin.hasNext())
        {  
            adjective = sin.next();
            Ad.add(adjective);
        }
        System.out.println("Adjectives: " + Ad);//end of adjectives
  
        PrintWriter s = null;
        Scanner sou = new Scanner(System.in);
        try
        { //start
            File sounds = new File("Sounds.txt");
            s = new PrintWriter(sounds);
        }
        catch (Exception ex)
        {
            System.out.println(ex);
        }
        String sound = "";
        while(!sound.equals("done"))
        {
            System.out.println("Enter sound effects or type done to stop: ");
            sound = sou.nextLine();
            if(!sound.equals("done"))
            {
                System.out.println(sound);            
                s.write(sound + "\n");
            }
        }
        s.close();
        //sou.close();//sounds
       
        //Scanner soun = null;
        try
        {
            sin = new Scanner(new File("Sounds.txt"));
        }
        catch(Exception ex)
        {
            System.out.println(ex);
            System.exit(0);
        }
        List<String> S = new ArrayList<>();
        while(sin.hasNext())
        {  
            sound = sin.next();
            S.add(sound);
        }
        System.out.println("Sounds: " + N);//end of sounds
  
        PrintWriter num = null;
        Scanner nums = new Scanner(System.in);
        try
        { //start
            File numbers = new File("Numbers.txt");
            num = new PrintWriter(numbers);
        }
        catch (Exception ex)
        {
            System.out.println(ex);
        }
        String number = "";
        while(!number.equals("done"))
        {
            System.out.println("Enter number or type done to stop: ");
            number = nums.nextLine();
            if(!number.equals("done"))
            {
                System.out.println(number);            
                num.write(number + "\n");
            }
        }
        num.close();
        //nums.close();//numbers  
       
        //Scanner numb = null;
        try
        {
            sin = new Scanner(new File("Numbers.txt"));
        }
        catch(Exception ex)
        {
            System.out.println(ex);
            System.exit(0);
        }
        List<String> Nu = new ArrayList<>();
        while(sin.hasNext())
        {  
            number = sin.next();
            Nu.add(number);
        }
        System.out.println("Numbers: " + Nu);//end of numbers
   
        Scanner cin = new Scanner(System.in);
        char op;
        do
        {
            System.out.println("Choose your genre! \n1)Horror \n2)Comedy \n3)Romance \n4)Historical \n0)QUIT");
            op = cin.next().charAt(0);
            switch(op)
            {
                case '1': horror(Ad, V, N, B, F, A, S, Nu);
                    break;
                case '2': comedy(Ad, V, N, B, F, A, S, Nu);
                    break;
                case '3': romance(Ad, V, N, B, F, A, S, Nu);
                    break;
                case '4': historical(Ad, V, N, B, F, A, S, Nu);
                    break;
                case '0': System.out.println("Goodbye.");
                    System.exit(0);
                default: System.out.println("Input Error.\n");
            }
        }
        while (op != 0);
        cin.close();
        sin.close();
    }//main
  
    static void horror(List<String> ad , List<String> V, List<String> N, List<String> B,  List<String> F,  List<String> A, List<String> S, List<String> Nu)
    {
        System.out.println("I will never forget the night it happened. It was a " + ad.get((int)(Math.random()* ad.size())) + " night, and I was " + V.get((int)(Math.random()* ad.size())) + " upstairs with my good " + N.get((int)(Math.random()* ad.size())) + " and my faithful " + N.get((int)(Math.random()* ad.size())) + ". Suddenly there was a loud " + S.get((int)(Math.random()* ad.size())) + ". I sprang to my " + B.get((int)(Math.random()* ad.size())) + " and crept downstairs, trying to be as " + ad.get((int)(Math.random()* ad.size())) + " as I could. Nothing looked out of the ordinary. Suddenly I heard the " + S.get((int)(Math.random()* ad.size())) + " again, but this time it was much more " + ad.get((int)(Math.random()* ad.size())) + " and I knew it was coming from the basement. Summoning my courage, I grabbed a " + N.get((int)(Math.random()* ad.size())) + " and strode down the stairs. I might have met my end right there, if not for " + F.get((int)(Math.random()* ad.size())) + " , who let out a loud \" "+ S.get((int)(Math.random()* ad.size())) + " !\" Startled, I jumped to the side just in time to avoid a long gooey appendage. I turned my " + N.get((int)(Math.random()* ad.size())) + "on the intruder and gasped in horror. Lurking there in my basement, bathed in the glow of my " + N.get((int)(Math.random()* ad.size())) + ", was a huge, quivering, shapeless blob of ooze! The hideous thing was as " + ad.get((int)(Math.random()* ad.size())) + " as a " + N.get((int)(Math.random()* ad.size())) + " and as big as a(n) " + N.get((int)(Math.random()* ad.size())) +"\" " + S.get((int)(Math.random()* ad.size())) + "!\" I cried. I fled upstairs, but the thing chased me with lightning speed. I was trapped, and knew I had to fight if I wanted to survive. First I tried to chop it with a sharp" + N.get((int)(Math.random()* ad.size())) + " from the kitchen, then I shot it with my grandpas " + N.get((int)(Math.random()* ad.size())) + " that hangs over the fireplace. In desperation, I even tried throwing " + N.get((int)(Math.random()* ad.size())) + "s on it, but all to no avail. It just kept coming. I thought I was dead for sure, when suddenly a strange figure crashed through my window and leapt between us! He was tall and " + ad.get((int)(Math.random()* ad.size())) +" , with fierce " + B.get((int)(Math.random()* ad.size())) + " and shoulders. He was dressed entirely in black, except for his " + N.get((int)(Math.random()* ad.size())) + "\"" + S.get((int)(Math.random()* ad.size())) + "!\" the figure cried, and quick as a " + N.get((int)(Math.random()* ad.size())) +" he jumped in and stunned the ooze creature with a powerful kick. Without pause he scooped the thing into a(n) " + N.get((int)(Math.random()* ad.size())) + " and tied it shut with a long " + N.get((int)(Math.random()* ad.size()))+ "\"How did you do that?!\" I gasped, trying to catch my breath. \"Their only weakness is their" + B.get((int)(Math.random()* ad.size())) + "\" he replied. \"One good kick and the things are helpless.\" I thanked him for saving my life and he told me \"Join me in my quest and we will make the world safe from their evil!\"");
    }
    static void comedy(List<String> ad, List<String> V, List<String> N,  List<String> B,  List<String> F,  List<String> A, List<String> S, List<String> Nu)
    {
        System.out.println("I always knew I was " + ad.get((int)(Math.random()* ad.size())) + " and this time, I was " + V.get((int)(Math.random()* ad.size())) + " in front of the audience and began to perform my set. My " + B.get((int)(Math.random()* ad.size())) + "(s) were sweating with nerves, and I looked to the row my  " + F.get((int)(Math.random()* ad.size())) + " was sitting in and heard a loud " + S.get((int)(Math.random()* ad.size())) + ". A lady had brought her " + A.get((int)(Math.random()* ad.size())) + " to the show, and it started running towards the stage. I was so terified and mortified that I peed my pants. " );
    }
    static void romance(List<String> ad , List<String> V, List<String> N,  List<String> B,  List<String> F,  List<String> A, List<String> S, List<String> Nu)
    {
        System.out.println("The year was " + Nu.get((int)(Math.random()* ad.size())) + " and I was in Madagascar doing some scientific studies on the cracking mating behavior of " + N.get((int)(Math.random()* ad.size())) + "s. It was difficult because "+ N.get((int)(Math.random()* ad.size())) + "s were so hard to obtain. I was operating in lab one day when a woman walked in carrying a particularly " + ad.get((int)(Math.random()* ad.size())) + " specimen. \"Hi, I heard you were looking for these! My name is Moana.\" As we talked, I couldn't stop looking at her amazing " + B.get((int)(Math.random()* ad.size())) + "s, her incredible " + B.get((int)(Math.random()* ad.size())) + "s, and her beautiful " + B.get((int)(Math.random()* ad.size())) + " \" Will you take me to where you found this\" I asked. \"Sure,\" she said. As we walked there, we found a restaurant that served delicious fried " + N.get((int)(Math.random()* ad.size())) + " and powerful drinks made of vodka and " + N.get((int)(Math.random()* ad.size())) +". The next thing I knew, we were back in my apartment " + V.get((int)(Math.random()* ad.size())) +". After a whole night of " + V.get((int)(Math.random()* ad.size())) +", I knew I was in love with her. After " + Nu.get((int)(Math.random()* ad.size())) + " months, I proposed to her. I still remember her saying 'Yes' as I slipped the ring onto her " + B.get((int)(Math.random()* ad.size())) + ". At the wedding, she said to me, \"You know what I love about you? You're " +ad.get((int)(Math.random()* ad.size())) + ", " + ad.get((int)(Math.random()* ad.size())) + ", and "+ ad.get((int)(Math.random()* ad.size())) + " of course, but what I love most is your sense of humor and your " + ad.get((int)(Math.random()* ad.size())) + " " + N.get((int)(Math.random()* ad.size())) + ". Of course the fact that we both love " + N.get((int)(Math.random()* ad.size())) +"s doesn't hurt either ' Now, " + Nu.get((int)(Math.random()* ad.size())) + " years later, we are still together, living in a house in Moscow with our " + Nu.get((int)(Math.random()* ad.size())) + " children and our pet " + N.get((int)(Math.random()* ad.size())) + " Tanya. But even after all this time, I still remember the time that I met my wife, and a feeling of " + N.get((int)(Math.random()* ad.size())) + "s fill my " + B.get((int)(Math.random()* ad.size())) + ".");
    }
  
    static void historical(List<String> ad , List<String> V, List<String> N,  List<String> B,  List<String> F,  List<String> A, List<String> S, List<String> Nu)
    {
        System.out.println("Growing up, my " + F.get((int)(Math.random()* ad.size())) + " always told me about former president John F Kennedy. He was born in year " + Nu.get((int)(Math.random()* ad.size())) + " and lived with his " + F.get((int)(Math.random()* ad.size())) + " till he died. " + " JFK was extremely " + ad.get((int)(Math.random()* ad.size())) + ", but people believed he was afraid of " + N.get((int)(Math.random()* ad.size())) + "s. Everyday, he would be " + V.get((int)(Math.random()* ad.size())) + " to his " + F.get((int)(Math.random()* ad.size())) + " about this fear. Sadly one day, he was " + V.get((int)(Math.random()* ad.size())) + ", leading to his death.");
    }
  
  
 }//class
  
 
