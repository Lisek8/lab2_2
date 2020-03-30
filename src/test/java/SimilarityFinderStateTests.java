import edu.iis.mto.search.SearchResult;
import edu.iis.mto.similarity.SimilarityFinder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimilarityFinderStateTests {
    private int[] emptySequence = {};
    
    @Test
    public void emptySequencesTest() {
        SimilarityFinder similarityFinder = new SimilarityFinder((elem, seq) -> SearchResult.builder().withFound(false).build());
        assertEquals(1, similarityFinder.calculateJackardSimilarity(emptySequence, emptySequence), 0.001);
    }
}