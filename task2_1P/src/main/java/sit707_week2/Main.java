package sit707_week2;

/**
 * Hello world!
 * @author Khem Raj Gurung
 */
public class Main 
{
    public static void main( String[] args )
    {
        SeleniumOperations.officeworks_registration_page("https://www.officeworks.com.au/app/identity/create-account");
        SeleniumOperations.amazon_registration_page("https://www.amazon.com.au/ap/register?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com.au%2Fs%3Fk%3Damazon%2Bcom%2Bau%2Bsign%2Bin%26adgrpid%3D85717360703%26hvadid%3D591133012310%26hvdev%3Dc%26hvlocphy%3D9071454%26hvnetw%3Dg%26hvqmt%3Db%26hvrand%3D11156373274810292349%26hvtargid%3Dkwd-801831701945%26hydadcr%3D2630_351050%26mcid%3Dcba9e9697cda37f6afa667fb39d7717c%26tag%3Dgooghydr0au-22%26ref%3Dnav_custrec_signin&prevRID=TSQJTQJ1MVYHVDS139C4&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=auflex&openid.mode=checkid_setup&prepopulatedLoginId=&failedSignInCount=0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=auflex&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
    }
    
}
