import model.Trader;
import model.Transaction;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static junit.framework.TestCase.assertEquals;

public class Queries {

    Trader raoul;
    Trader alan;
    Trader brian;
    List<Transaction> transactions;
    Trader mario;
    private List<Trader> traders;

    @Before
    public void setUp() throws Exception {

        raoul = new Trader("Raoul", "Cambridge");
        alan = new Trader("Alan", "Cambridge");
        brian = new Trader("Brian", "Cambridge");
        mario = new Trader("Mario", "Milan");

        traders = Arrays.asList(raoul, alan, brian, mario);
        transactions = createTransacitons();
    }

    private List<Transaction> createTransacitons() {

        List<Transaction> transactions = new ArrayList<>();
        transactions.add(new Transaction(raoul, 2012, 1000));
        transactions.add(new Transaction(raoul, 2011, 400));
        transactions.add(new Transaction(mario, 2012, 710));
        transactions.add(new Transaction(mario, 2012, 700));
        transactions.add(new Transaction(alan, 2012, 950));
        transactions.add(new Transaction(brian, 2011, 300));

        return transactions;
    }

    /**
     *
     * What are the unique cities where the traders work
     */
    @Test
    public void whatAreUniqueCitiesWhereTradersWork() throws Exception {

        List<String> uniqueCities = traders.stream().map(Trader::getCity).distinct().collect(Collectors.toList());
        uniqueCities.forEach(System.out::println);

        assertEquals(2, uniqueCities.size());

    }


    /**
     *
     * Find all traders from Cambridge and sort them by name
     * Return a String of all traders name sorted by name
     * Are any traders based in Milan
     * Print all transaction traders based in Cambridge
     *
     */


}
