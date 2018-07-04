package com.javacodegeeks.advanced.generics;

public class GenericMethods< T > {
    public GenericMethods( final T initialAction ) {
        // Implementation here
    }
    
    public< J > GenericMethods( final T initialAction, final J nextAction ) {
        // Implementation here
    }
    
    public< R > R performAction( final T action ) {
        //final R result = (R) action;
        // Implementation here



        
        return (R) action;
    }
    
    public< U, R > R performAnotherAction( final U action ) {
        final R result = null;
        // Implementation here
        return result;
    }

    public static void main(String[] args) {
        GenericMethods<Number> s = new GenericMethods<Number>(1200);

        String gg = s.<String>performAction(1200);
    }
}
