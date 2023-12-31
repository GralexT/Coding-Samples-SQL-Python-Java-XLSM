/**
 * Polynomial models polynomials.
 * 
 * @author Lyndon While
 * @version 1.0
 */
import java.util.ArrayList;

public class Polynomial
{
    // the terms making up the polynomial
    private ArrayList<Term> polynomial;

    // creates a zero polynomial
    public Polynomial()
    {
        polynomial = new ArrayList<>();
    }
    
    // returns the number of terms in polynomial
    public int numberOfTerms()
    {
        return polynomial.size();
    }
    
    // adds a new term to the end of polynomial
    public void addTerm(Term t)
    {
        polynomial.add(t);
    }

    // returns the indicated term of polynomial
    public Term getTerm(int k)
    {
        if (0 <= k && k < numberOfTerms()) return polynomial.get(k);
        else                               return null;
    }
    
    // returns polynomial as a String for display 
    // see the sample file and the test program for the layout required 
    public String displayPolynomial()
    {
        String poly = "";
        for(Term i : polynomial){poly = poly+i.displayImproved();}
        if(poly.charAt(0)=='-'){
            return poly;
        }
        return poly.substring(1,poly.length()); //Removes additions from beginning of polynomial.
    }
}