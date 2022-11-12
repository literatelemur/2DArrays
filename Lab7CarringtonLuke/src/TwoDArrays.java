
public class TwoDArrays {
	
	public static double averagePPG(int[][] scores, int p) {
		double avg = 0;
		for (int i = 0; i < scores[p].length; i ++) {
			avg += scores[p][i];
		}
		avg = avg / scores[p].length;
		return avg;
	}
	
	public static int singleGameScore(int[][] scores, int g) {
		int total = 0;
		for (int i = 0; i < scores.length; i ++) 
			total += scores[i][g];
		return total;
	}
	
	public static double averageGameScore(int[][] scores) {
		double totalPoints = 0;
		double totalAvg = 0;
		for ( int i = 0; i < scores[0].length; i ++) {
			for (int j = 0; j < scores.length; j ++) {
				totalPoints += scores[j][i];
			}
		}
		totalAvg = totalPoints / scores[0].length;
		return totalAvg;
	}
	
	public static int singleGameTopScoringPlayer(int[][] scores, int g) {
		int highestScore = scores[0][g];
		int highestPlayer = 0;
		for (int i = 1; i < scores.length; i ++) {
			if (scores[i][g] > highestScore) {
				highestScore = scores[i][g];
				highestPlayer = i;
			}
		}
		return highestPlayer;
	}
	
	public static void main(String[] args) {
	int[][] stats = {{20, 27, 16, 23, 20, 27, 18}, {8, 18, 14, 17, 9, 12, 0}, {38, 19, 25, 22, 19, 25, 31}, {17, 8, 11, 21, 15, 0, 9}, {2, 1, 3, 0, 10, 2, 4}};
	
	System.out.println(averagePPG(stats, 2));
	System.out.println(singleGameScore(stats, 0));
	System.out.println(averageGameScore(stats));
	System.out.println(singleGameTopScoringPlayer(stats, 2));
	
	}

}
