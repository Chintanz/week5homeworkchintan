package javaprogramme;

import java.util.Arrays;

/** Write a programme that tells you which line passes through particular stations.
 Just use Zone 1 stations name.*/

public class Programme_10 {
    public static void main(String[] args) {
        char result;
        System.out.println("This is Zone 1 Station list : ");
        System.out.println("");
        String[] zone1Stations = {"Aldgate", "Aldgate East", "Angel", "Baker Street", "Bank", "Barbican",
                "Bayswater", "Blackfriars", "Bond Street", "Borough", "Cannon Street", "Chancery Lane", "Charing Cross", "City Thameslink",
                "Covent Garden", "Earl's Court", "Edgware Road (Bakerloo)","Edgware Road (Circle/District/Hammersmith & City)", "Elephant & Castle",
                "Embankment", "Euston", "Euston Square","Farringdon", "Fenchurch Street", "Gloucester Road", "Goodge Street","Great Portland Street",
                "Green Park", "High Street Kensington", "Holborn", "Holland Park", "Hyde Park Corner", "King's Cross St. Pancras",
                "Knightsbridge", "Lambeth North", "Lancaster Gate", "Leicester Square", "Liverpool Street", "London Bridge","Mansion House",
                "Marble Arch", "Marylebone", "Monument","Moorgate","Notting Hill Gate","Old Street","Oxford Circus","Paddington","Piccadilly Circus","Pimlico","Queensway","Regent's Park","Russell Square",
                "St. James's Park","St. Paul's","Shepherd's Bush (Central)","Sloane Square","South Kensington","Southwark","Stamford Brook (District)",
                "Temple","Tottenham Court Road","Tower Gateway","Tower Hill","Victoria","Warren Street","Waterloo","Westminster"};
        String[][] lines = {{"Metropolitan Line"},{"Circle Line"},{"Northern Line"},{"Bakerloo Line"},
                {"Central Line"},{"District Line"},{"Hammersmith & City Line"},{"Jubilee Line"},{"Victoria Line"}};
        for(int i=0;i<zone1Stations.length;i++){
            System.out.print(zone1Stations[i] + ": ");
            for(int j=0;j<lines.length;j++){
                if(Arrays.asList(lines[j]).contains(zone1Stations[i])){
                    System.out.print(j+1 + ", ");
                }
            }


        }
    }
}
