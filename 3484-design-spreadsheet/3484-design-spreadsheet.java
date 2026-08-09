class Spreadsheet {
    Map<String, Integer> ans;

    public Spreadsheet(int rows) {
        ans = new HashMap<>();
    }

    public void setCell(String cell, int value) {
        ans.put(cell, value);

    }

    public void resetCell(String cell) {
        ans.remove(cell);
    }

    public int getValue(String formula) {
        formula = formula.substring(1);
        String[] fo = formula.split("\\+");
        int sum = 0;
        for (String s : fo) {
            if (Character.isDigit(s.charAt(0))) {
                sum += Integer.parseInt(s);
            } else {
                sum += ans.getOrDefault(s,0);
            }
        }

        return sum;

    }
}

/**
 * Your Spreadsheet object will be instantiated and called as such:
 * Spreadsheet obj = new Spreadsheet(rows);
 * obj.setCell(cell,value);
 * obj.resetCell(cell);
 * int param_3 = obj.getValue(formula);
 */