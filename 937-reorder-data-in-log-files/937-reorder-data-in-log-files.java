class Solution {
public String[] reorderLogFiles(String[] logs) {
	List<String> digits = new ArrayList<>();
	List<String> letters = new ArrayList();

	for (String log : logs) {
		String remain = log.substring(log.indexOf(" ") + 1);
		if (remain.charAt(0) > 47 && remain.charAt(0) < 58)       // if it is digit,  add to digit list
			digits.add(log);
		else
			addLetterInOrder(letters, log);                        // if it is letter,  add to list in order
	}

	int i = 0;
	for (String s : letters)
		logs[i++] = s;

	for (String digit : digits)
		logs[i++] = digit;

	return logs;
}

private void addLetterInOrder(List<String> list, String log) {
	if (list.isEmpty()) {
		list.add(log);
		return;
	}
	String logRemain = log.substring(log.indexOf(" ") + 1);                    // remain part of current log to compare items of letter list
	for (int i = 0; i < list.size(); i++) {
		String current = list.get(i);
		String resRemain = current.substring(current.indexOf(" ") + 1);
		int equality = logRemain.compareTo(resRemain);
		if (equality < 0) {
			list.add(i, log);
			return;
		} else if (equality == 0) {                                             // if remaining parts are equals, compare original log string
			if (log.compareTo(current) <= 0) {
				list.add(i, log);
				return;
			}
		}
	}
	list.add(log);
}
}