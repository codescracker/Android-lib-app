/**
 * SQL commands
 * Including select/delete/update/insert
 */

package library.Shaowei.constant;

/**
 * Created by Shaowei on 2/15/2016.
 */

public abstract class SQLCommand
{
    //list all data in books table
    public static String QUERY_1 = "select lbcallnum, lbtitle from Libbook";
    //List the call numbers of books with the title ‘Database Management’
    public static String QUERY_2 = "select lbcallnum from Libbook where lbtitle like '%Database Management%'";
    public static String QUERY_3 = "select coduedate from Checkout";
    public static String QUERY_4 = "select coreturend from Checkout";
    public static String QUERY_5 = "select * from Student natural join Checkout";
    public static String QUERY_6 = "select * from LibBook natural join Checkout";
    public static String QUERY_7 = "select stid from Checkout";
    public static String RETURN_BOOK = "update checkout set coreturned=? where stid=? and lbcallnum=?";
    public static String CHECK_BOOK = "insert into checkout(stid,lbcallnum,coduedate,coreturned) values(?,?,?,?)";
    //checkout summary
    public static String CHECKOUT_SUMMARY = "select strftime('%m',coduedate) as month,count(*) as total from checkout where strftime('%Y',coduedate)='2011' group by month order by total desc";
    public static String CHECKOUT_LIST = "select checkout.stid as _id, lbtitle, coduedate,coreturned,cofine,stname from checkout,student,libbook where student.stid=checkout.stid and libbook.lbcallnum=checkout.lbcallnum";
}



