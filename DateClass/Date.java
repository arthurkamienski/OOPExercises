class Date {
	private int day;
	private int month;
	private int year;

	private static int numberOfDateObjects = 0;

	Date() {
		Date.numberOfDateObjects++;
		this.setDate(1, 1, 1970);
	}

	Date(int day, int month, int year) {
		Date.numberOfDateObjects++;
		this.setDate(day, month, year);
	}

	Date(Date otherDate) {
		Date.numberOfDateObjects++;
		this.setDate(otherDate.getDay(),
			otherDate.getMonth(),
			otherDate.getYear());
	}

	public boolean setDate(int day, int month, int year) {
		boolean valid = checkDate(day, month, year);

		if(valid) {
			this.setDay(day);
			this.setMonth(month);
			this.setYear(year);
		}

		return valid;
	}

	public static boolean isLeapYear(int year) {
		boolean isLeap = false;

		if(year % 4 == 0)
			if(year % 100 == 0) {
				if(year % 400 == 0)
					isLeap = true;
			}
			else
				isLeap = true;

		return isLeap;
	}

	public static boolean checkDay(int day, int month, int year) {
		boolean valid = false;

		if(day > 0 && day <= 31) {
			if(day == 31) {
				switch(month) {
					case 1:
					case 3:
					case 5:
					case 7:
					case 8:
					case 10:
					case 12:
						if(day <= 31) {
							valid = true;
						}
						break;
					default:
						break;
				}
			}
			else {
				if(month == 2) {
					if(day <= 29) {
						if(day == 29)
							valid = Date.isLeapYear(year);
						else
							valid = true;
					}
				}
				else
					valid = true;
			}
		}

		return valid;
	}

	public static boolean checkMonth(int month) {
		return month >= 1 && month <= 12;
	}

	public static boolean checkDate(int day, int month, int year) {
		return Date.checkMonth(month) && Date.checkDay(day, month, year);
	}

	public String toString() {
		return String.format("%02d.%02d.%04d",
			this.getDay(),
			this.getMonth(),
			this.getYear());
	}

	public boolean isBefore(Date otherDate) {
		boolean before = false;

		if(this.getYear() == otherDate.getYear()) {
			if(this.getMonth() == otherDate.getMonth()) {
				before = this.getDay() < otherDate.getDay();
			}
			else if (this.getMonth() < otherDate.getMonth()){
				before = true;
			}

		} else if(this.getYear() < otherDate.getYear()) {
			before = true;
		}

		return before;
	}

	public Date addDay() {
		int newDay = this.getDay()+1;
		int newMonth = this.getMonth();
		int newYear = this.getYear();

		if(!Date.checkDay(newDay, newMonth, newYear)) {
			newDay = 1;

			if(!Date.checkMonth(++newMonth)) {
				newMonth = 1;
				newYear++;
			}
		}

		return new Date(newDay, newMonth, newYear);
	}

	public static int getNumberOfDateObjects() {
		return numberOfDateObjects;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getDay() {
		return this.day;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getYear() {
		return this.year;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getMonth() {
		return this.month;
	}
}