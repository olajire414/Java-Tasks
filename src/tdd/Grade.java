package tdd;

import java.util.Scanner;

public class Grade {

    public static final int PASS_MARK = 50;
    
    public static boolean isValidScore(int score) {
        return score >= 0 && score <= 100;
    }
    
    public static int calculateTotal(int[] scores) {
        int total = 0;
        for (int index = 0; index < scores.length; index++) {
            total += scores[index];
        }
        return total;
    }
    
    public static double calculateAverage(int[] scores) {
        return (double) calculateTotal(scores) / scores.length;
    }

   
    public static int[] extractSubjectColumn(int[][] allScores, int subjectIndex, int numStudents) {
        int[] column = new int[numStudents];
        for (int student = 0; student < numStudents; student++) {
            column[student] = allScores[student][subjectIndex];
        }
        return column;
    }

  
    public static int[] calculateAllTotals(int[][] allScores, int numStudents, int numSubjects) {
        int[] totals = new int[numStudents];
        for (int student = 0; student < numStudents; student++) {
            totals[student] = calculateTotal(allScores[student]);
        }
        return totals;
    }
    
    public static double[] calculateAllAverages(int[][] allScores, int numStudents,
                                                int numSubjects) {
        double[] averages = new double[numStudents];
        for (int student = 0; student < numStudents; student++) {
            averages[student] = calculateAverage(allScores[student]);
        }
        return averages;
    }

    public static int findMaxIndex(int[] values) {
        int maxIndex = 0;
        for (int index = 1; index < values.length; index++) {
            if (values[index] > values[maxIndex]) {
                maxIndex = index;
            }
        }
        return maxIndex;
    }
    
    public static int findMinIndex(int[] values) {
        int minIndex = 0;
        for (int index = 1; index < values.length; index++) {
            if (values[index] < values[minIndex]) {
                minIndex = index;
            }
        }
        return minIndex;
    }
    
    public static int countPasses(int[] scores, int passMark) {
        int passes = 0;
        for (int index = 0; index < scores.length; index++) {
            if (scores[index] >= passMark) {
                passes++;
            }
        }
        return passes;
    }
    
    public static int countFails(int[] scores, int passMark) {
        return scores.length - countPasses(scores, passMark);
    }
    
    public static int[] calculatePositions(int[] totals) {
        int numStudents = totals.length;
        int[] positions = new int[numStudents];

        for (int index = 0; index < numStudents; index++) {
            int level = 1;
            for (int secIndex = 0; secIndex < numStudents; secIndex++) {
                if (totals[secIndex] > totals[index]) {
                    level++;
                }
            }
            positions[index] = level;
        }
        return positions;
    }
    
    public static int calculateClassTotal(int[] studentTotals) {
        int classTotal = 0;
        for (int index = 0; index < studentTotals.length; index++) {
            classTotal += studentTotals[index];
        }
        return classTotal;
    }
    public static double calculateClassAverage(int[] studentTotals) {
        return (double) calculateClassTotal(studentTotals) / studentTotals.length;
    }

    
    public static int findHardestSubject(int[][] allScores, int numStudents,
                                         int numSubjects, int passMark) {
        int hardestSubject = 0;
        int mostFails = -1;
        for (int subject = 0; subject < numSubjects; subject++) {
            int[] column = extractSubjectColumn(allScores, subject, numStudents);
            int fails = countFails(column, passMark);
            if (fails > mostFails) {
                mostFails = fails;
                hardestSubject = subject;
            }
        }
        return hardestSubject;
    }
    
    public static int findEasiestSubject(int[][] allScores, int numStudents,
                                         int numSubjects, int passMark) {
        int easiestSubject = 0;
        int mostPasses = -1;
        for (int subject = 0; subject < numSubjects; subject++) {
            int[] column = extractSubjectColumn(allScores, subject, numStudents);
            int passes = countPasses(column, passMark);
            if (passes > mostPasses) {
                mostPasses = passes;
                easiestSubject = subject;
            }
        }
        return easiestSubject;
    }
    
    public static int[] findOverallHighest(int[][] allScores, int numStudents,
                                           int numSubjects) {
        int bestStudent = 0, bestSubject = 0, bestScore = allScores[0][0];
        for (int student = 0; student < numStudents; student++) {
            for (int subject = 0; subject < numSubjects; subject++) {
                if (allScores[student][subject] > bestScore) {
                    bestScore = allScores[student][subject];
                    bestStudent = student;
                    bestSubject = subject;
                }
            }
        }
        return new int[] {bestStudent, bestSubject, bestScore};
    }
    
    public static int[] findOverallLowest(int[][] allScores, int numStudents,
                                          int numSubjects) {
        int worstStudent = 0, worstSubject = 0, worstScore = allScores[0][0];
        for (int student = 0; student < numStudents; student++) {
            for (int subject = 0; subject < numSubjects; subject++) {
                if (allScores[student][subject] < worstScore) {
                    worstScore = allScores[student][subject];
                    worstStudent = student;
                    worstSubject = subject;
                }
            }
        }
        return new int[] {worstStudent, worstSubject, worstScore};
    }

    

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("How many students do you have?\n");
        int numStudents = input.nextInt();

        System.out.print("How many subject do they offer?\n");
        int numSubjects = input.nextInt();
        
        int[][] scores = new int[numStudents][numSubjects];

        for (int student = 0; student < numStudents; student++) {
            System.out.println("Entering score for student " + (student + 1));

            for (int subject = 0; subject < numSubjects; subject++) {
                int score;
                boolean valid;

                do {
                    System.out.println("Enter score for subject " + (subject + 1));
                    score = input.nextInt();
                    valid = isValidScore(score);
                    if (!valid) {
                        System.out.println("Invalid score! Score must be between 0 and 100.");
                    }
                } while (!valid);

                scores[student][subject] = score;
            }

            System.out.println("Saving >>>>>>>>>>>>>>>>>>>>");
            System.out.println("Saved successfully");
        }

        int[] totals = calculateAllTotals(scores, numStudents, numSubjects);
        double[] averages = calculateAllAverages(scores, numStudents, numSubjects);
        int[] positions = calculatePositions(totals);

        
        System.out.println();
        System.out.println(buildDivider(numSubjects, '='));
        System.out.printf("%-10s", "STUDENT");
        for (int subject = 0; subject < numSubjects; subject++) {
            System.out.printf("%8s", "SUB" + (subject + 1));
        }
        System.out.printf("%8s%8s%8s%n", "TOT", "AVE", "POS");
        System.out.println(buildDivider(numSubjects, '='));

        for (int student = 0; student < numStudents; student++) {
            System.out.printf("%-10s", "Student " + (student + 1));
            for (int subject = 0; subject < numSubjects; subject++) {
                System.out.printf("%8d", scores[student][subject]);
            }
            System.out.printf("%8d%8.2f%8d%n", totals[student], averages[student],
                    positions[student]);
        }
        System.out.println(buildDivider(numSubjects, '='));
        
        System.out.println();
        System.out.println("SUBJECT SUMMARY");
        for (int subject = 0; subject < numSubjects; subject++) {
            int[] column = extractSubjectColumn(scores, subject, numStudents);
            int highIndex = findMaxIndex(column);
            int lowIndex = findMinIndex(column);
            int subjectTotal = calculateTotal(column);
            double subjectAverage = calculateAverage(column);
            int passes = countPasses(column, PASS_MARK);
            int fails = countFails(column, PASS_MARK);

            System.out.println("Subject " + (subject + 1));
            System.out.println("Highest scoring student is:  Student " + (highIndex + 1)
                    + " scoring " + column[highIndex]);
            System.out.println("Lowest Scoring student is: student " + (lowIndex + 1)
                    + " scoring " + column[lowIndex]);
            System.out.println("Total Score is:  " + subjectTotal);
            System.out.printf("Average score is: %.2f%n", subjectAverage);
            System.out.println("Number of passes: " + passes);
            System.out.println("Number of Fails: " + fails);
            System.out.println();
        }
        
        int hardestSubject = findHardestSubject(scores, numStudents, numSubjects, PASS_MARK);
        int easiestSubject = findEasiestSubject(scores, numStudents, numSubjects, PASS_MARK);
        int[] hardestColumn = extractSubjectColumn(scores, hardestSubject, numStudents);
        int[] easiestColumn = extractSubjectColumn(scores, easiestSubject, numStudents);
        int[] overallHigh = findOverallHighest(scores, numStudents, numSubjects);
        int[] overallLow = findOverallLowest(scores, numStudents, numSubjects);

        System.out.println("The hardest subject is Subject " + (hardestSubject + 1)
                + " with " + countFails(hardestColumn, PASS_MARK) + " failures");
        System.out.println("The easiest subject is Subject " + (easiestSubject + 1)
                + " with " + countPasses(easiestColumn, PASS_MARK) + " passes");
        System.out.println("The overall Highest score is scored by Student "
                + (overallHigh[0] + 1) + " in subject " + (overallHigh[1] + 1)
                + " scoring " + overallHigh[2]);
        System.out.println("The overall Lowest score is scored by Student "
                + (overallLow[0] + 1) + " in subject " + (overallLow[1] + 1)
                + " scoring " + overallLow[2]);
        System.out.println(buildDivider(numSubjects, '='));

 
        int classTotal = calculateClassTotal(totals);
        double classAverage = calculateClassAverage(totals);
        int bestStudent = findMaxIndex(totals);
        int worstStudent = findMinIndex(totals);

        System.out.println();
        System.out.println("CLASS SUMMARY");
        System.out.println(buildDivider(numSubjects, '='));
        System.out.println("Best Graduating Student is: Student " + (bestStudent + 1)
                + " scoring " + totals[bestStudent]);
        System.out.println(buildDivider(numSubjects, '='));
        System.out.println();
        System.out.println(buildDivider(numSubjects, '!'));
        System.out.println("Worst Graduating Student is: Student " + (worstStudent + 1)
                + " scoring " + totals[worstStudent]);
        System.out.println(buildDivider(numSubjects, '!'));
        System.out.println();
        System.out.println(buildDivider(numSubjects, '='));
        System.out.println("Class total score is: " + classTotal);
        System.out.printf("Class Average score is: %.1f%n", classAverage);
        System.out.println(buildDivider(numSubjects, '='));

        input.close();
    }
    
    private static String buildDivider(int numSubjects, char symbol) {
        int width = 50 + numSubjects * 4;
        StringBuilder line = new StringBuilder();
        for (int index = 0; index < width; index++) {
            line.append(symbol);
        }
        return line.toString();
    }
}