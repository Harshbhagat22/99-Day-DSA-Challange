import java.util.*;

public class LeadersUsingArrayList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> leaders = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			leaders.add(sc.nextInt());
		}

		ArrayList<Integer> result = findLeader(leaders);
		display(result);
	}

	public static ArrayList<Integer> findLeader(ArrayList<Integer> leaders) {
		ArrayList<Integer> answer = new ArrayList<>();
		int lead = leaders.get(leaders.size() - 1);
		answer.add(lead);

		for (int i = leaders.size() - 2; i >= 0; i--) {
			if (leaders.get(i) > lead) {
				lead = leaders.get(i);
				answer.add(lead);
			}
		}

		Collections.reverse(answer);
		return answer;
	}

	public static void display(ArrayList<Integer> temp) {
		for (int i = 0; i < temp.size(); i++) {
			System.out.print(temp.get(i) + " ");
		}
	}
}
