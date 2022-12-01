/**
 *	Example program for using eventlists
 *	@author Joel Karel
 *	@version %I%, %G%
 */

package org.ssa;

public class Simulation {

    public CEventList list;
    public Queue queue;
    public Source source;
    public Sink sink;
    public Machine mach;

    public static Ambulance[][] ambulances = new Ambulance[7][5]; // FIXME 7 zones, 5 ambulances per zone

        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        //create the ambulances
        for (int i = 0; i < 7; i++) { //the 7 zones
            for (int j = 0; j < 5; j++) { //the number of ambulances per zone
                ambulances[i][j] = new Ambulance(i, j,0, 0, true);
            }
        }

    	// Create an eventlist
        CEventList l = new CEventList(); //Generate people
        // A queue for the machine
        Queue q = new Queue(); //Order by importance
        // A source
        //Order the people in different zones and get the manhattan distance
        // Each source asks the queue for the next patient in the corresponding zone and sends it to the machine
        Source s = new Source(q,l,"Source 1");
        // A sink
        Sink si = new Sink("Sink 1"); //People get dropped off by the hospital
        // A machine
        Machine m = new Machine(q,si,l,"Machine 1"); //Check if an ambulance is back at the docking station
        // start the eventlist
        l.start(2000); // 2000 is maximum time
    }
    
}
