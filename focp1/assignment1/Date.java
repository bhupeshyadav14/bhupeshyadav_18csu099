class Date
{
	int day;
	int month;
	int year;
	
	Date(int day,int month,int year)
	{
		this.day=day;
		this.month=month;
		this.year=year;
	}
	void daout()
	{
		System.out.print(day+"/"+month+"/"+year);
	}
}
