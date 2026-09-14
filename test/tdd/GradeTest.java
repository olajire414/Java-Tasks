package tdd;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class GradeTest {
    


        @Test
        public void testThatCalculateTotalAddsScores() {
            int[] scores = {70, 80, 90};

            assertEquals(240, Grade.calculateTotal(scores));
        }

        @Test
        public void testThatCalculateAverageReturnsAverage() {
            int[] scores = {70, 80, 90};

            assertEquals(80.0, Grade.calculateAverage(scores));
        }

        @Test
        public void testThatExtractSubjectColumnReturnsCorrectScores() {
            int[][] allScores = {
                    {70, 80, 90},
                    {60, 75, 85},
                    {50, 65, 95}
            };

            int[] expected = {80, 75, 65};

            assertArrayEquals(
                    expected,
                    Grade.extractSubjectColumn(allScores, 1, 3)
            );
        }

        @Test
        public void testThatCalculateAllTotalsReturnsAllStudentTotals() {
            int[][] allScores = {
                    {70, 80, 90},
                    {60, 75, 85},
                    {50, 65, 95}
            };

            int[] expected = {240, 220, 210};

            assertArrayEquals(
                    expected,
                    Grade.calculateAllTotals(allScores, 3, 3)
            );
        }

        @Test
        public void testThatCalculateAllAveragesReturnsAllStudentAverages() {
            int[][] allScores = {
                    {70, 80, 90},
                    {60, 75, 85},
                    {50, 65, 95}
            };

            double[] expected = {80.0, 220.0 / 3, 70.0};

            assertArrayEquals(
                    expected,
                    Grade.calculateAllAverages(allScores, 3, 3),
                    0.001
            );
        }

        @Test
        public void testThatFindMaxIndexReturnsIndexOfHighestValue() {
            int[] values = {40, 90, 60, 75};

            assertEquals(1, Grade.findMaxIndex(values));
        }

        @Test
        public void testThatFindMinIndexReturnsIndexOfLowestValue() {
            int[] values = {40, 90, 20, 75};

            assertEquals(2, Grade.findMinIndex(values));
        }

        @Test
        public void testThatCountPassesCountsScoresAbovePassMark() {
            int[] scores = {40, 50, 70, 30, 80};

            assertEquals(3, Grade.countPasses(scores, 50));
        }

        @Test
        public void testThatCountFailsCountsScoresBelowPassMark() {
            int[] scores = {40, 50, 70, 30, 80};

            assertEquals(2, Grade.countFails(scores, 50));
        }

        @Test
        public void testThatCalculatePositionsReturnsCorrectPositions() {
            int[] totals = {300, 250, 280};

            int[] expected = {1, 3, 2};

            assertArrayEquals(
                    expected,
                    Grade.calculatePositions(totals)
            );
        }

        @Test
        public void testThatCalculateClassTotalAddsStudentTotals() {
            int[] studentTotals = {300, 250, 280};

            assertEquals(830, Grade.calculateClassTotal(studentTotals));
        }

        @Test
        public void testThatCalculateClassAverageReturnsAverage() {
            int[] studentTotals = {300, 250, 280};

            assertEquals(
                    830.0 / 3,
                    Grade.calculateClassAverage(studentTotals),
                    0.001
            );
        }

        @Test
        public void testThatFindHardestSubjectReturnsSubjectWithMostFails() {
            int[][] allScores = {
                    {70, 40, 80},
                    {60, 30, 90},
                    {50, 20, 70}
            };

            assertEquals(
                    1,
                    Grade.findHardestSubject(allScores, 3, 3, 50)
            );
        }

        @Test
        public void testThatFindEasiestSubjectReturnsSubjectWithMostPasses() {
            int[][] allScores = {
                    {70, 40, 80},
                    {60, 30, 90},
                    {50, 20, 70}
            };

            assertEquals(
                    2,
                    Grade.findEasiestSubject(allScores, 3, 3, 50)
            );
        }

        @Test
        public void testThatFindOverallHighestReturnsStudentSubjectAndScore() {
            int[][] allScores = {
                    {70, 80, 90},
                    {60, 95, 85},
                    {50, 65, 75}
            };

            int[] expected = {1, 1, 95};

            assertArrayEquals(
                    expected,
                    Grade.findOverallHighest(allScores, 3, 3)
            );
        }

        @Test
        public void testThatFindOverallLowestReturnsStudentSubjectAndScore() {
            int[][] allScores = {
                    {70, 80, 90},
                    {60, 95, 85},
                    {50, 65, 75}
            };

            int[] expected = {2, 0, 50};

            assertArrayEquals(
                    expected,
                    Grade.findOverallLowest(allScores, 3, 3)
            );
        }
    }

