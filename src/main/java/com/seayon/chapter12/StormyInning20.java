package com.seayon.chapter12;// exceptions/StormyInning20.java
// TIJ4 Chapter Exceptions, Exercise 20, page 
/* MOdify StormyInning.java by adding an UmpireArgument exception type
 * and methods that throw this exception. Test the modified hierarchy.
 */

// Overridden methods may throw only the exceptions
// specified in their base-class versions, or exceptions
// derived from the base-class exceptions.

class BaseballException extends RuntimeException {}
class Foul extends BaseballException {}
class Strike extends BaseballException {}
class UmpireArgument extends BaseballException {}
class ThrownFromGame extends UmpireArgument {}

abstract class Inning {
    public Inning() throws BaseballException {}
    public void event() throws BaseballException {
        // Doesn't actually have to throw anything
    }
    public abstract void atBat() throws Strike, Foul, UmpireArgument;
    public void questionableCall() throws UmpireArgument {}
    public void walk() {} // Throws no checked exceptions
}

class StormException extends RuntimeException {}
class RainedOut extends StormException {}
class PopFoul extends Foul {}


interface Storm {
    public void event() throws RainedOut;
    public void rainHard() throws RainedOut;
}

public class StormyInning20 extends Inning implements Storm {
    // OK to add new exceptions for constructors, but you
    // must deal with the base constructor exceptions:
    public StormyInning20()
            throws UmpireArgument, RainedOut, BaseballException {}
    public StormyInning20(String s)
            throws Foul, BaseballException {}
    // Regular methods must comform to base class:
    //! void walk() throws PopFoul {} // Compile error
    // Interface CANNOT add exceptions to existing
    // methods from the base class:
    //! public void event() throws RainedOut {}
    // If method doesn't already exist in the
    // base class, the exception is OK:
    @Override
    public void rainHard() {}
    // You can choose to not throw any exceptions,
    // even if the base class version does:
    @Override
    public void event() {}
    // Overridden methods can throw inherited exceptions:
    @Override
    public void atBat() throws PopFoul, ThrownFromGame {
        throw new ThrownFromGame();
    }
    @Override
    public void questionableCall() throws UmpireArgument {
        throw new UmpireArgument();
    }
    public static void main(String[] args) {
            StormyInning20 si = new StormyInning20();
            si.atBat();
            si.questionableCall();

        // Strike not thrown in derived version.
        try {
            // What happens if you upcast?
            Inning i = new StormyInning20();
            i.atBat();
            // You must catch the exceptions from
            // the base-class version of the method:
        } catch(Strike e) {
            System.out.println("Strike");
        } catch(Foul e) {
            System.out.println("Foul");
        } catch(ThrownFromGame e) {
            System.out.println("Thrown from game (Inning)");
        } catch(RainedOut e) {
            System.out.println("Rained out");
        } catch(BaseballException e) {
            System.out.println("Generic baseball exception");
        }
    }
}