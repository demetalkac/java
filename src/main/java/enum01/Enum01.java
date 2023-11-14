package enum01;

public class Enum01 {
    enum Planets {
        MERCURY(1),
        VENUS(2),
        EARTH(3),
        MARS(4),
        JUPITER(5),
        SATURN(6),
        URANUS(7),
        NEPTUNE(8);

        final int number; //final keyword prevent some else to change that value

        Planets(int number){
            this.number = number;
        }

    }

    public static void main(String[] args) {

        //How we use the values we created in enum ?
        //We create our object

        //Planets planetName = new Planets();//It complains because we can just use new keywords to create new values from the scratch

        Planets nameOfPlanets = Planets.EARTH;//We just use existing values so the enum
        //It has the value of Earth

        //Planets nameOfPlanets1 = Planets.SUN; //Because it does not take place in the enum And we also cannot add it to our enum

        //Enum is very similar to use how we use any other variables For example

        if (nameOfPlanets == Planets.EARTH) {
            System.out.println("You can live in " + Planets.EARTH);
        } else {
            System.out.println("You cannot live there");
        }

        //Planets.Pluton; //it gives error because we did not assign this variable in the enum

        //to print a single element
        System.out.println(Planets.VENUS);

        //to get all the possible values from the enum
        Planets allPlanets [] = Planets.values();


        //it actually returns an array
        //to print something from this array is just like we learned before by using for each loop
        //or you can put allPlanets
        for (Planets p : Planets.values()) {
            System.out.println(p);   //We see all the possible values
        }

        //to print ordinal number / position of elements
        Planets pl = Planets.JUPITER;
        System.out.println(pl.ordinal());

        if(pl.ordinal()>2){
            System.out.println("You can not live there!");
        }

        //calling the canILiveHere method
        canILiveHere(nameOfPlanets);



    }


    //Can we create a static method by using enum ?

    static void canILiveHere(Planets nameOfPlanets){

        switch(nameOfPlanets){
            case EARTH:
                System.out.println("You can live here!");
                System.out.println("This is planet #" + nameOfPlanets.number);
                break;
            default:
                System.out.println("You cannot live here!");
                System.out.println("This is planet #" + nameOfPlanets.number);
                break;
        }


        //the last step calling this method




    }


}
