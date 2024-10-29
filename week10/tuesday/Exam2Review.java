public class Yelp {
    public static void main(String[] args) {
        Destination[] destinations = new Destination[4];

        for (int i = 0; i < destinations.length; i++) {
            destinations[i] = new Destination();
        }

        destinations[0].setName("Wilmington");
        destinations[0].setRating(5.0);
        destinations[0].setFirstPointOfInterest("Riverfront");
        destinations[0].setSecondPointOfInterest("Deltech");

        destinations[1].setName("New York");
        destinations[1].setRating(4.9);
        destinations[1].addPointOfInterest("Broadway");
        destinations[1].addPointOfInterest("Food");

        destinations[2].setName("Los Angeles");
        destinations[2].setRating(4.5);

        String[] losAngelesPointsOfInterest = {"Disneyland", "Universal Studios"};
        destinations[2].setPointsOfInterest(losAngelesPointsOfInterest);

        destinations[3].setName("Philadelphia");
        destinations[3].setRating(3.5);
        destinations[3].setPointOfInterest("Reading Market", 0);
        destinations[3].setPointOfInterest("The portal", 1);

        System.out.println("\n\nAll destinations: ");
        for (Destination each: destinations) {
            System.out.println("City: " + each.getName());
            System.out.println("Rating: " + each.getRating());
//            System.out.println("Points of interest: ");
//            for (int i = 0; i < each.getPointsOfInterest().length; i++) {
//                System.out.println(each.getPointsOfInterest()[i]);
//            }
            System.out.println("Points of interest are: ");
            String[] pointsOfInterest = each.getPointsOfInterest();
            for (int i = 0; i < pointsOfInterest.length; i++) {
                System.out.println(pointsOfInterest[i]);
            }
            System.out.println("------");
        }

        System.out.println("\n\nDestinations that are rating 4.5 or higher:");
        for (Destination each: destinations) {
            if (each.getRating() >= 4.5) {
                System.out.println("City: " + each.getName());
                System.out.println("Rating: " + each.getRating());
//            System.out.println("Points of interest: ");
//            for (int i = 0; i < each.getPointsOfInterest().length; i++) {
//                System.out.println(each.getPointsOfInterest()[i]);
//            }
                System.out.println("Points of interest are: ");
                String[] pointsOfInterest = each.getPointsOfInterest();
                for (int i = 0; i < pointsOfInterest.length; i++) {
                    System.out.println(pointsOfInterest[i]);
                }
            }
            System.out.println("------");
        }

    }
}

class Destination {
    private String name;
    private String city;
    private double rating;
    private String[] pointsOfInterest = new String[2];

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String[] getPointsOfInterest() {
        return pointsOfInterest;
    }

    public void addPointOfInterest(String pointOfInterest) {
        if (pointsOfInterest[0] == null) {
            // there IS an empty spot for a POI in first spot of array
            pointsOfInterest[0] = pointOfInterest;
        } else if (pointsOfInterest[1] == null) {
            // there IS an empty spot for a POI in the second spot of array
            pointsOfInterest[1] = pointOfInterest;
        } else {
            // there's no empty spots... you can't add a POI
            System.out.println("Can't add... full");
        }
    }

    public void setFirstPointOfInterest(String pointOfInterest) {
        pointsOfInterest[0] = pointOfInterest;
    }

    public void setSecondPointOfInterest(String pointOfInterest) {
        pointsOfInterest[1] = pointOfInterest;
    }

    public void setPointOfInterest(String pointOfInterest, int index) {
        if (index >= 0 && index < pointsOfInterest.length)
            pointsOfInterest[index] = pointOfInterest;
        else
            System.out.println("Can't do that... out of bounds!");
    }

    public void setPointsOfInterest(String[] pointsOfInterest) {
        this.pointsOfInterest = pointsOfInterest;
    }
}
