package models;

import utils.MatrixCount;


public class MatrixData {

    private int zeroYear;
    private int twentyYear;
    private int fortyYear;


    private int tenYear;
    private int thirtyYear;
    private int fiftyYear;
    private int sixtyYear;
    private int seventyYear;

    private int comfort;

    private int zeroYearOne;
    private int zeroYearTwo;
    private int zeroYearThree;

    private int tenYearOne;
    private int tenYearTwo;

    private int twentyYearOne;
    private int twentyYearTwo;
    private int twentyYearThree;

    private int thirtyYearOne;
    private int thirtyYearTwo;

    private int fortyYearOne;
    private int fortyYearTwo;

    private int fiftyYearOne;
    private int fiftyYearTwo;


    private int sixtyYearOne;
    private int sixtyYearTwo;

    private int seventyYearOne;
    private int seventyYearTwo;

    private int center;
    private int relations;
    private int career;

    private int earth;
    private int sky;
    private int earthSkySum;

    private int male;
    private int female;
    private int maleFemaleSum;

    private int spirit;
    private int planet;


    public MatrixData(Person person) {
        MatrixCount count = new MatrixCount();
        this.zeroYear = count.counter(person.getBirthDay());
        this.twentyYear = count.counter(person.getBirthMonth());
        this.fortyYear = count.counter(person.getBirthYear());

        this.tenYear = count.counter(zeroYear + twentyYear);
        this.thirtyYear = count.counter(twentyYear + fortyYear);
        this.sixtyYear = count.counter(zeroYear + twentyYear + fortyYear);
        this.fiftyYear = count.counter(fortyYear + sixtyYear);
        this.seventyYear = count.counter(sixtyYear + zeroYear);

        this.comfort = count.counter(zeroYear + twentyYear + fortyYear + sixtyYear);

        this.zeroYearTwo = count.counter(zeroYear + comfort);
        this.zeroYearOne = count.counter(zeroYear + zeroYearTwo);
        this.zeroYearThree = count.counter(zeroYearTwo + comfort);

        this.tenYearTwo = count.counter(tenYear + comfort);
        this.tenYearOne = count.counter(tenYear + tenYearTwo);

        this.twentyYearTwo = count.counter(twentyYear + comfort);
        this.twentyYearOne = count.counter(twentyYear + twentyYearTwo);
        this.twentyYearThree = count.counter(twentyYearTwo + comfort);

        this.thirtyYearTwo = count.counter(thirtyYear + comfort);
        this.thirtyYearOne = count.counter(thirtyYear + thirtyYearTwo);

        this.fortyYearTwo = count.counter(fortyYear + comfort);
        this.fortyYearOne = count.counter(fortyYear + fortyYearTwo);

        this.fiftyYearTwo = count.counter(fiftyYear + comfort);
        this.fiftyYearOne = count.counter(fiftyYear + fiftyYearTwo);


        this.sixtyYearTwo = count.counter(sixtyYear + comfort);
        this.sixtyYearOne = count.counter(sixtyYear + sixtyYearTwo);

        this.seventyYearTwo = count.counter(seventyYear + comfort);
        this.seventyYearOne = count.counter(seventyYear + seventyYearTwo);

        this.center = count.counter(fortyYearTwo + sixtyYearTwo);
        this.relations = count.counter(sixtyYearTwo + center);
        this.career = count.counter(fortyYearTwo + center);

        this.earth = count.counter(twentyYear + sixtyYear);
        this.sky = count.counter(zeroYear + fortyYear);
        this.earthSkySum = count.counter(earth + sky);

        this.male = count.counter(tenYear + fiftyYear);
        this.female = count.counter(thirtyYear + seventyYear);
        this.maleFemaleSum = count.counter(male + female);

        this.spirit = count.counter(earthSkySum + maleFemaleSum);

        this.planet = count.counter(maleFemaleSum + spirit);
    }

    /*public MatrixCount getCount() {
        return count;
    }*/

    public int getZeroYear() {
        return zeroYear;
    }

    public int getTwentyYear() {
        return twentyYear;
    }

    public int getFortyYear() {
        return fortyYear;
    }

    public int getTenYear() {
        return tenYear;
    }

    public int getThirtyYear() {
        return thirtyYear;
    }

    public int getFiftyYear() {
        return fiftyYear;
    }

    public int getSixtyYear() {
        return sixtyYear;
    }

    public int getSeventyYear() {
        return seventyYear;
    }

    public int getComfort() {
        return comfort;
    }

    public int getZeroYearOne() {
        return zeroYearOne;
    }

    public int getZeroYearTwo() {
        return zeroYearTwo;
    }

    public int getZeroYearThree() {
        return zeroYearThree;
    }

    public int getTenYearOne() {
        return tenYearOne;
    }

    public int getTenYearTwo() {
        return tenYearTwo;
    }

    public int getTwentyYearOne() {
        return twentyYearOne;
    }

    public int getTwentyYearTwo() {
        return twentyYearTwo;
    }

    public int getTwentyYearThree() {
        return twentyYearThree;
    }

    public int getThirtyYearOne() {
        return thirtyYearOne;
    }

    public int getThirtyYearTwo() {
        return thirtyYearTwo;
    }

    public int getFortyYearOne() {
        return fortyYearOne;
    }

    public int getFortyYearTwo() {
        return fortyYearTwo;
    }

    public int getFiftyYearOne() {
        return fiftyYearOne;
    }

    public int getFiftyYearTwo() {
        return fiftyYearTwo;
    }



    public int getSixtyYearOne() {
        return sixtyYearOne;
    }

    public int getSixtyYearTwo() {
        return sixtyYearTwo;
    }

    public int getSeventyYearOne() {
        return seventyYearOne;
    }

    public int getSeventyYearTwo() {
        return seventyYearTwo;
    }

    public int getCenter() {
        return center;
    }

    public int getRelations() {
        return relations;
    }

    public int getCareer() {
        return career;
    }

    public int getEarth() {
        return earth;
    }

    public int getSky() {
        return sky;
    }

    public int getEarthSkySum() {
        return earthSkySum;
    }

    public int getMale() {
        return male;
    }

    public int getFemale() {
        return female;
    }

    public int getMaleFemaleSum() {
        return maleFemaleSum;
    }

    public int getSpirit() {
        return spirit;
    }

    public int getPlanet() {
        return planet;
    }


    @Override
    public String toString() {
        return "MatrixData{" +
                " zeroYear=" + zeroYear +
                ", twentyYear=" + twentyYear +
                ", fortyYear=" + fortyYear +
                ", tenYear=" + tenYear +
                ", thirtyYear=" + thirtyYear +
                ", fiftyYear=" + fiftyYear + "\n" +
                ", sixtyYear=" + sixtyYear +
                ", seventyYear=" + seventyYear +
                ", comfort=" + comfort +
                ", zeroYearOne=" + zeroYearOne +
                ", zeroYearTwo=" + zeroYearTwo +
                ", zeroYearThree=" + zeroYearThree + "\n" +
                ", tenYearOne=" + tenYearOne +
                ", tenYearTwo=" + tenYearTwo +
                ", twentyYearOne=" + twentyYearOne +
                ", twentyYearTwo=" + twentyYearTwo +
                ", twentyYearThree=" + twentyYearThree +
                ", thirtyYearOne=" + thirtyYearOne + "\n" +
                ", thirtyYearTwo=" + thirtyYearTwo +
                ", fortyYearOne=" + fortyYearOne +
                ", fortyYearTwo=" + fortyYearTwo +
                ", fiftyYearOne=" + fiftyYearOne +
                ", fiftyYearTwo=" + fiftyYearTwo +
                ", sixtyYearOne=" + sixtyYearOne +
                ", sixtyYearTwo=" + sixtyYearTwo +
                ", seventyYearOne=" + seventyYearOne +
                ", seventyYearTwo=" + seventyYearTwo +
                ", center=" + center +
                ", relations=" + relations + "\n" +
                ", career=" + career +
                ", earth=" + earth +
                ", sky=" + sky +
                ", earthSkySum=" + earthSkySum +
                ", male=" + male +
                ", female=" + female + "\n" +
                ", maleFemaleSum=" + maleFemaleSum +
                ", spirit=" + spirit +
                ", planet=" + planet +
                '}';
    }
}
