package computerdatabase

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class PolestarLogin1 extends Simulation {

  val httpProtocol = http
    .baseUrl("https://polestarfinancialservices-uat.cld.jmfamily.com")
    .inferHtmlResources(BlackList(""".*\.js""", """.*\.css""", """.*\.gif""", """.*\.jpeg""", """.*\.jpg""", """.*\.ico""", """.*\.woff""", """.*\.woff2""", """.*\.(t|o)tf""", """.*\.png""", """.*detectportal\.firefox\.com.*"""), WhiteList())
    .userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.106 Safari/537.36")
    .silentResources


  val VerificationToken = regex("""<input name="__RequestVerificationToken" type="hidden" value="(.*?)" />""")
    .saveAs("Token")

  val VerificationToken1 = regex("""<input name="__RequestVerificationToken" type="hidden" value="(.*?)" />""")
    .saveAs("Token1")

  val csvFeeder = csv("login.csv").circular
  val contactFeeder = csv("contactdetails.csv").circular

  val headers_0 = Map(
    "accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-US,en;q=0.9",
    "sec-ch-ua" -> """ Not;A Brand";v="99", "Google Chrome";v="91", "Chromium";v="91""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-fetch-dest" -> "document",
    "sec-fetch-mode" -> "navigate",
    "sec-fetch-site" -> "same-origin",
    "sec-fetch-user" -> "?1",
    "upgrade-insecure-requests" -> "1")

  val headers_1 = Map(
    "sec-ch-ua" -> """ Not;A Brand";v="99", "Google Chrome";v="91", "Chromium";v="91""",
    "sec-ch-ua-mobile" -> "?0")

  val headers_14 = Map(
    "accept" -> "*/*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-US,en;q=0.9",
    "content-type" -> "text/plain;charset=UTF-8",
    "origin" -> "https://polestarfinancialservices-uat.cld.jmfamily.com",
    "sec-ch-ua" -> """ Not;A Brand";v="99", "Google Chrome";v="91", "Chromium";v="91""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "same-origin")

  val headers_16 = Map(
    "accept" -> "*/*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-US,en;q=0.9",
    "content-type" -> "text/plain;charset=UTF-8",
    "origin" -> "https://polestarfinancialservices-uat.cld.jmfamily.com",
    "sec-ch-ua" -> """ Not;A Brand";v="99", "Google Chrome";v="91", "Chromium";v="91""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "no-cors",
    "sec-fetch-site" -> "same-origin")

  val headers_29 = Map(
    "accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-US,en;q=0.9",
    "origin" -> "https://polestarfinancialservices-uat.cld.jmfamily.com",
    "sec-ch-ua" -> """ Not;A Brand";v="99", "Google Chrome";v="91", "Chromium";v="91""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-fetch-dest" -> "document",
    "sec-fetch-mode" -> "navigate",
    "sec-fetch-site" -> "same-origin",
    "sec-fetch-user" -> "?1",
    "upgrade-insecure-requests" -> "1")

  val headers_63 = Map(
    "Accept" -> "application/json, text/plain, */*",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "en-US,en;q=0.9",
    "Origin" -> "https://polestarfinancialservices-uat.cld.jmfamily.com",
    "Sec-Fetch-Dest" -> "empty",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "cross-site",
    "sec-ch-ua" -> """ Not;A Brand";v="99", "Google Chrome";v="91", "Chromium";v="91""",
    "sec-ch-ua-mobile" -> "?0")

  val uri1 = "https://www.googletagmanager.com/gtm.js"
  val uri2 = "https://secure.shippingapis.com/ShippingAPI.dll"

  val scn = scenario("Polestar_Login")
    .exec(http("TC01_S01_SETF_Customerwebsite_Login_HomePage")
      .get("/")
      .headers(headers_0)
      .check(VerificationToken)
      .check(status.is(200))
      .resources(http("request_1")
        .get("/areas/polestarfinancialservices/content/styles.css?v=1.0.7842.30659")
        .headers(headers_1),
        http("request_2")
          .get("/-/media/images/header/polestarfinancialservices/logo.svg")
          .headers(headers_1),
        http("request_3")
          .get("/-/media/images/benefits/volvocarfinancialservices/24-7_access.png?h=116&w=116&hash=6BF1150C2D4776EA955F3C1261C76287")
          .headers(headers_1),
        http("request_4")
          .get("/-/media/images/benefits/volvocarfinancialservices/management.png?h=116&w=116&hash=C5403D99A8B6DD6AD431E97FF9B19516")
          .headers(headers_1),
        http("request_5")
          .get("/-/media/images/benefits/volvocarfinancialservices/offers.png?h=116&w=116&hash=4FC8A10A03419B8F9BB20FF97330DE18")
          .headers(headers_1),
        http("request_6")
          .get("/-/media/images/benefits/volvocarfinancialservices/alerts.png?h=116&w=116&hash=969B76BA7B2C4370DC0CD735A98BA053")
          .headers(headers_1),
        http("request_7")
          .get("/-/media/images/footer/polestarfinancialservices/logo.svg?h=68&w=197&hash=44D1991D0BFFCFB1DD79DD58A4CD191C")
          .headers(headers_1),
        http("request_8")
          .get("/areas/polestarfinancialservices/scripts/vendors~main.bundle.js?v=1.0.7842.30659")
          .headers(headers_1),
        http("request_9")
          .get("/areas/polestarfinancialservices/scripts/main.bundle.js?v=1.0.7842.30659")
          .headers(headers_1),
        http("request_10")
          .get(uri1 + "?id=GTM-WFBMMPW")
          .headers(headers_1),
        http("request_11")
          .get("/-/media/images/contentblocks/polestarfinancialservices/homepage/ss-man-on-yellow-couch-reversed.jpg?h=720&w=1280&hash=0B7B09372AF5E43364D8BD8D3E0E2F4D")
          .headers(headers_1),
        http("request_12")
          .get("/-/media/images/reusablecontent/cards/polestarfinancialservices/homepage/homepage-driving_in_parking_garage.jpg?h=720&w=1280&hash=25746D341779112417C22C0BE4F0AAA3")
          .headers(headers_1),
        http("request_13")
          .get("/areas/polestarfinancialservices/images/svgsheet.svg?v=1.0.7842.30659")
          .headers(headers_1)))
    .pause(5)
    /*.exec(http("request_14")
      .post("/rb_bf85681zfc?type=js&session=v_4_srv_7_sn_0B7A32009878319214A530B72D8449D7_perc_100000_ol_0_mul_1_app-3Afaf2468c809214d0_1_rcs-3Acss_0&svrid=7&flavor=post&visitID=ILMAUKAVMMPEKOWVKCDQRULSJPLFRUFF-0&modifiedSince=1624477596456&referer=https%3A%2F%2Fcm-polestarfinancialservices-uat.cld.jmfamily.com%2F&app=faf2468c809214d0&crc=2213042011&end=1")
      .headers(headers_14)
      .body(RawFileBody("gatlingpractice/login10/0014_request.txt")))
    .pause(1)*/
    /*.exec(http("request_15")
      .post("/rb_bf85681zfc?type=js&session=v_4_srv_7_sn_0B7A32009878319214A530B72D8449D7_perc_100000_ol_0_mul_1_app-3Afaf2468c809214d0_1_rcs-3Acss_0&svrid=7&flavor=post&visitID=ILMAUKAVMMPEKOWVKCDQRULSJPLFRUFF-0&modifiedSince=1624477596456&referer=https%3A%2F%2Fcm-polestarfinancialservices-uat.cld.jmfamily.com%2F&app=faf2468c809214d0&crc=4290544594&end=1")
      .headers(headers_14)
      .body(RawFileBody("gatlingpractice/login10/0015_request.txt")))
    .pause(15)*/
    /*.exec(http("request_16")
      .post("/rb_bf85681zfc?type=js&session=v_4_srv_7_sn_0B7A32009878319214A530B72D8449D7_perc_100000_ol_0_mul_1_app-3Afaf2468c809214d0_1_rcs-3Acss_0&svrid=7&flavor=post&visitID=ILMAUKAVMMPEKOWVKCDQRULSJPLFRUFF-0&modifiedSince=1624477596456&referer=https%3A%2F%2Fcm-polestarfinancialservices-uat.cld.jmfamily.com%2F&app=faf2468c809214d0&crc=2370383370&end=1")
      .headers(headers_16)
      .body(RawFileBody("gatlingpractice/login10/0016_request.txt"))
      .resources(http("request_17")
      .get("/login")
      .headers(headers_0),
            http("request_18")
      .get("/areas/polestarfinancialservices/content/styles.css?v=1.0.7842.30659")
      .headers(headers_1),
            http("request_19")
      .get("/-/media/images/header/polestarfinancialservices/logo.svg")
      .headers(headers_1),
            http("request_20")
      .get("/-/media/images/footer/polestarfinancialservices/logo.svg?h=68&w=197&hash=44D1991D0BFFCFB1DD79DD58A4CD191C")
      .headers(headers_1),
            http("request_21")
      .get("/areas/polestarfinancialservices/scripts/vendors~main.bundle.js?v=1.0.7842.30659")
      .headers(headers_1),
            http("request_22")
      .get("/areas/polestarfinancialservices/scripts/main.bundle.js?v=1.0.7842.30659")
      .headers(headers_1),
            http("request_23")
      .get(uri1 + "?id=GTM-WFBMMPW")
      .headers(headers_1),
            http("request_24")
      .get("/-/media/images/contentblocks/polestarfinancialservices/modules/polestar1-launch-sanfran-oceanside2.jpg?h=720&w=1280&hash=81419D4F1E4D3AB4170FDEE208914057")
      .headers(headers_1),
            http("request_25")
      .get("/areas/polestarfinancialservices/images/svgsheet.svg?v=1.0.7842.30659")
      .headers(headers_1)))
    .pause(1)*/
    /*.exec(http("request_26")
      .post("/rb_bf85681zfc?type=js&session=v_4_srv_7_sn_0B7A32009878319214A530B72D8449D7_perc_100000_ol_0_mul_1_app-3Afaf2468c809214d0_1_rcs-3Acss_0&svrid=7&flavor=post&visitID=ILMAUKAVMMPEKOWVKCDQRULSJPLFRUFF-0&modifiedSince=1624477596456&referer=https%3A%2F%2Fcm-polestarfinancialservices-uat.cld.jmfamily.com%2Flogin&app=faf2468c809214d0&crc=2438983961&end=1")
      .headers(headers_14)
      .body(RawFileBody("gatlingpractice/login10/0026_request.txt")))
    .pause(1)*/
    /*.exec(http("request_27")
      .post("/rb_bf85681zfc?type=js&session=v_4_srv_7_sn_0B7A32009878319214A530B72D8449D7_perc_100000_ol_0_mul_1_app-3Afaf2468c809214d0_1_rcs-3Acss_0&svrid=7&flavor=post&visitID=ILMAUKAVMMPEKOWVKCDQRULSJPLFRUFF-0&modifiedSince=1624477596456&referer=https%3A%2F%2Fcm-polestarfinancialservices-uat.cld.jmfamily.com%2Flogin&app=faf2468c809214d0&crc=3854408901&end=1")
      .headers(headers_14)
      .body(RawFileBody("gatlingpractice/login10/0027_request.txt")))
    .pause(8)
    .exec(http("request_28")
      .post("/rb_bf85681zfc?type=js&session=v_4_srv_7_sn_0B7A32009878319214A530B72D8449D7_perc_100000_ol_0_mul_1_app-3Afaf2468c809214d0_1_rcs-3Acss_0&svrid=7&flavor=post&visitID=ILMAUKAVMMPEKOWVKCDQRULSJPLFRUFF-0&modifiedSince=1624477596456&referer=https%3A%2F%2Fcm-polestarfinancialservices-uat.cld.jmfamily.com%2Flogin&app=faf2468c809214d0&crc=3774846794&end=1")
      .headers(headers_14)
      .body(RawFileBody("gatlingpractice/login10/0028_request.txt")))
    .pause(34)*/
    .feed(csvFeeder)
    .exec(http("TC02_S01_SETF_Customerwebsite_Login_LoginPage")
      .post("/")
      .headers(headers_29)
      //.disableFollowRedirect
      //.check(currentLocationRegex("""<h2> class="sign-in__heading"</h2>"""))
      //.formParam("__RequestVerificationToken", "JQS31x9TGgrZPAXQ_Di_OfnNaXUyAh4VJfns78cXW9NehW8a_nXZNtBGaOiFdG-SS_7wMieLIt_lBu6VsLD1-pltzn-FfvX66X0nSZTGqAo1")
      .formParam("__RequestVerificationToken", "${Token}")
      .formParam("username", "${userid}")
      .formParam("password", "${password}")
      //.check(currentLocationRegex("""Sign in"""))/html/body/main/div[2]/section[2]/div/h2  /html/body/main/div[2]/section[2]/div/h2  body > main > div.login-registration > section.login-registration__module > div > h2
      //.check(css("/html/body/main/div[2]/section[2]/div/h2", "Sign In"))
      //.check(css("h2").transform((s: String) => s.indexOf("Sign In")))           //.check(css("h1").transform((s: String) => s.indexOf("Access denied"))
      //.greaterThan(-1).exitHereIfFailed
      //.check(substring("Sign In"))
      .check(status.is(200))
      //.check(currentLocationRegex("""Sign In"""))
      //.check(css("Sign In", nodeAttribute="h2"))
      .resources(http("request_30")
        .get("/areas/polestarfinancialservices/content/styles.css?v=1.0.7842.30659")
        .headers(headers_1),
        http("request_31")
          .get("/areas/polestarfinancialservices/scripts/vendors~main.bundle.js?v=1.0.7842.30659")
          .headers(headers_1),
        http("request_32")
          .get("/areas/polestarfinancialservices/scripts/main.bundle.js?v=1.0.7842.30659")
          .headers(headers_1),
        http("request_33")
          .get("/-/media/images/header/polestarfinancialservices/logo-white.svg")
          .headers(headers_1),
        http("request_34")
          .get("/-/media/images/vehicle-information/account-activity-panel/statement-icon.svg")
          .headers(headers_1),
        http("request_35")
          .get("/-/media/images/footer/polestarfinancialservices/logo-white.svg")
          .headers(headers_1),
        http("request_36")
          .get(uri1 + "?id=GTM-WFBMMPW")
          .headers(headers_1),
        http("request_37")
          .get("/-/media/images/reusablecontent/cards/polestarfinancialservices/right-rail-images/ss-woman-on-laptop.jpg?h=720&w=1280&hash=E33EEA5D3BF0C8EF6F917CA34734D6D2")
          .headers(headers_1),
        http("request_38")
          .get("/-/media/images/reusablecontent/cards/polestarfinancialservices/right-rail-images/paymenthowtopay_bike-and-sunset.jpg?h=720&w=1280&hash=9E6B5E9033FFC288AAB7613D4AAF1A6A")
          .headers(headers_1),
        http("request_39")
          .get("/-/media/images/reusablecontent/cards/polestarfinancialservices/homepage/polestar-dashboard-navigation-connect.jpg?h=270&w=480&hash=5A05CB98A79326D93E02D71369BDB9A0")
          .headers(headers_1),
        http("request_40")
          .get("/areas/SETF/images/content-managed/vehicle/vehicle-1.svg")
          .headers(headers_1),
        http("request_41")
          .get("/areas/polestarfinancialservices/images/svgsheet.svg?v=1.0.7842.30659")
          .headers(headers_1)))
    .pause(5)
    /*.exec(http("request_42")
      .post("/rb_bf85681zfc?type=js&session=v_4_srv_7_sn_0B7A32009878319214A530B72D8449D7_perc_100000_ol_0_mul_1_app-3Afaf2468c809214d0_1_rcs-3Acss_0&svrid=7&flavor=post&visitID=ILMAUKAVMMPEKOWVKCDQRULSJPLFRUFF-0&modifiedSince=1624477596456&referer=https%3A%2F%2Fcm-polestarfinancialservices-uat.cld.jmfamily.com%2Fvehicle-dashboard&app=faf2468c809214d0&crc=2896242108&end=1")
      .headers(headers_14)
      .body(RawFileBody("gatlingpractice/login10/0042_request.txt")))
    .pause(1)*/
    /*.exec(http("request_43")
      .post("/rb_bf85681zfc?type=js&session=v_4_srv_7_sn_0B7A32009878319214A530B72D8449D7_perc_100000_ol_0_mul_1_app-3Afaf2468c809214d0_1_rcs-3Acss_0&svrid=7&flavor=post&visitID=ILMAUKAVMMPEKOWVKCDQRULSJPLFRUFF-0&modifiedSince=1624477596456&referer=https%3A%2F%2Fcm-polestarfinancialservices-uat.cld.jmfamily.com%2Fvehicle-dashboard&app=faf2468c809214d0&crc=2903610082&end=1")
      .headers(headers_14)
      .body(RawFileBody("gatlingpractice/login10/0043_request.txt")))
    .pause(20)*/
    .exec(http("TC03_S01_SETF_Customerwebsite_Login_VehicleDashboardPage")
      .get("/vehicle-settings/change-contact-info-form")
      .headers(headers_0)
      .check(VerificationToken1)
      .check(status.is(200))
      .resources(http("request_45")
        .get("/areas/polestarfinancialservices/content/styles.css?v=1.0.7842.30659")
        .headers(headers_1),
        http("request_46")
          .get("/-/media/images/header/polestarfinancialservices/logo-white.svg")
          .headers(headers_1),
        http("request_47")
          .get("/-/media/images/navigation/polestarfinancialservices/address-book.png?h=512&w=448&hash=4DFB51DFD947E9265CCE7991F2896D89")
          .headers(headers_1),
        http("request_48")
          .get("/-/media/images/navigation/usd-circle.svg")
          .headers(headers_1),
        http("request_49")
          .get("/-/media/images/navigation/polestarfinancialservices/usd-circle.png?h=256&w=256&hash=F2BAC9842B7061CA7218244291D08001")
          .headers(headers_1),
        http("request_50")
          .get("/-/media/images/navigation/polestarfinancialservices/bell.png?h=512&w=448&hash=D48DD03B3252F35E4191DDBE15B5AFD5")
          .headers(headers_1),
        http("request_51")
          .get("/-/media/images/navigation/polestarfinancialservices/cog.png?h=267&w=256&hash=6D9A4AC4C39D6FD5F43B6395A018CA00")
          .headers(headers_1),
        http("request_52")
          .get("/-/media/images/navigation/polestarfinancialservices/clock.png?h=512&w=512&hash=C9BD7D9DEE2903F440EEEF6EEC5DB66B")
          .headers(headers_1),
        http("request_53")
          .get("/-/media/images/navigation/file-signature.svg")
          .headers(headers_1),
        http("request_54")
          .get(uri1 + "?id=GTM-WFBMMPW")
          .headers(headers_1),
        http("request_55")
          .get("/-/media/images/footer/polestarfinancialservices/logo-white.svg")
          .headers(headers_1),
        http("request_56")
          .get("/areas/polestarfinancialservices/scripts/vendors~main.bundle.js?v=1.0.7842.30659")
          .headers(headers_1),
        http("request_57")
          .get("/areas/polestarfinancialservices/scripts/main.bundle.js?v=1.0.7842.30659")
          .headers(headers_1),
        http("request_58")
          .get("/areas/SETF/images/content-managed/vehicle/vehicle-1.svg")
          .headers(headers_1),
        http("request_59")
          .get("/areas/polestarfinancialservices/images/svgsheet.svg?v=1.0.7842.30659")
          .headers(headers_1)))
    //.pause(1)
    /*.exec(http("request_60")
      .post("/rb_bf85681zfc?type=js&session=v_4_srv_7_sn_0B7A32009878319214A530B72D8449D7_perc_100000_ol_0_mul_1_app-3Afaf2468c809214d0_1_rcs-3Acss_0&svrid=7&flavor=post&visitID=ILMAUKAVMMPEKOWVKCDQRULSJPLFRUFF-0&modifiedSince=1624477596456&referer=https%3A%2F%2Fcm-polestarfinancialservices-uat.cld.jmfamily.com%2Fvehicle-settings%2Fchange-contact-info-form&app=faf2468c809214d0&crc=2237774693&end=1")
      .headers(headers_14)
      .body(RawFileBody("gatlingpractice/login10/0060_request.txt")))
    .pause(1)*/
    /*.exec(http("request_61")
      .post("/rb_bf85681zfc?type=js&session=v_4_srv_7_sn_0B7A32009878319214A530B72D8449D7_perc_100000_ol_0_mul_1_app-3Afaf2468c809214d0_1_rcs-3Acss_0&svrid=7&flavor=post&visitID=ILMAUKAVMMPEKOWVKCDQRULSJPLFRUFF-0&modifiedSince=1624477596456&referer=https%3A%2F%2Fcm-polestarfinancialservices-uat.cld.jmfamily.com%2Fvehicle-settings%2Fchange-contact-info-form&app=faf2468c809214d0&crc=1697258348&end=1")
      .headers(headers_14)
      .body(RawFileBody("gatlingpractice/login10/0061_request.txt")))
    .pause(10)
    .exec(http("request_62")
      .post("/rb_bf85681zfc?type=js&session=v_4_srv_7_sn_0B7A32009878319214A530B72D8449D7_perc_100000_ol_0_mul_1_app-3Afaf2468c809214d0_1_rcs-3Acss_0&svrid=7&flavor=post&visitID=ILMAUKAVMMPEKOWVKCDQRULSJPLFRUFF-0&modifiedSince=1624477596456&referer=https%3A%2F%2Fcm-polestarfinancialservices-uat.cld.jmfamily.com%2Fvehicle-settings%2Fchange-contact-info-form&app=faf2468c809214d0&crc=2720494215&end=1")
      .headers(headers_14)
      .body(RawFileBody("gatlingpractice/login10/0062_request.txt")))
    .pause(15)*/
    /*.exec(http("request_63")
      .get(uri2 + "?API=Verify&XML=%3CAddressValidateRequest%20USERID=%22525JMFAM5266%22%3E%3CRevision%3E1%3C/Revision%3E%3CAddress%20ID=%220%22%3E%3CAddress1%3E%3C/Address1%3E%3CAddress2%3E3%20ROBIN%20LNDG%3C/Address2%3E%3CCity%3EMONROE%3C/City%3E%3CState%3ECT%3C/State%3E%3CZip5%3E06468%3C/Zip5%3E%3CZip4%3E%3C/Zip4%3E%3C/Address%3E%3C/AddressValidateRequest%3E")
      .headers(headers_63))*/
    .pause(15)

    .feed(contactFeeder)
    .exec(http("TC04_S01_SETF_Customerwebsite_Login_Change_contact_info_Form")
      .post("/vehicle-settings/change-contact-info-form")
      .headers(headers_29)
      .check(status.is(200))
      //	.formParam("__RequestVerificationToken", "gM6A7AJtLYJUvUxzoaPsdNZ_U-Zp6daM8zoJ6KYHxflcjkitsvM4ePeuQP3BhZ8oOhO-YGSvq54yLkTdB7vfLvrMEqz05DzsD06CQ-cei92LnSJSWZgE-HMPs0JikwjKQi3E5Kn1m4NxfZoI9bWNiQ2")
      .formParam("__RequestVerificationToken", "${Token1}")
      .formParam("streetAddress", "${streetadd1}")
      .formParam("aptSuiteOther", "")
      .formParam("city", "${city1}")
      .formParam("state", "${state1}")
      .formParam("zip", "${zip1}")
      .formParam("homePhone", "${homep}")
      .formParam("workPhone", "${workp}")
      .formParam("vehicleSameAddress", "true")
      /*	.formParam("vehicleStreetAddress", "${vehiclesadd}")
        .formParam("vehicleAptSuiteOther", "")
        .formParam("vehicleCity", "${vc}")
        .formParam("state", "${state2}")
        .formParam("vehicleZip", "${zip}")*/
      .resources(http("request_65")
        .get("/areas/polestarfinancialservices/content/styles.css?v=1.0.7842.30659")
        .headers(headers_1),
        http("request_66")
          .get("/-/media/images/header/polestarfinancialservices/logo-white.svg")
          .headers(headers_1),
        http("request_67")
          .get("/-/media/images/navigation/polestarfinancialservices/address-book.png?h=512&w=448&hash=4DFB51DFD947E9265CCE7991F2896D89")
          .headers(headers_1),
        http("request_68")
          .get("/-/media/images/navigation/usd-circle.svg")
          .headers(headers_1),
        http("request_69")
          .get("/-/media/images/navigation/polestarfinancialservices/usd-circle.png?h=256&w=256&hash=F2BAC9842B7061CA7218244291D08001")
          .headers(headers_1),
        http("request_70")
          .get("/-/media/images/navigation/polestarfinancialservices/bell.png?h=512&w=448&hash=D48DD03B3252F35E4191DDBE15B5AFD5")
          .headers(headers_1),
        http("request_71")
          .get("/-/media/images/navigation/polestarfinancialservices/cog.png?h=267&w=256&hash=6D9A4AC4C39D6FD5F43B6395A018CA00")
          .headers(headers_1),
        http("request_72")
          .get("/-/media/images/navigation/polestarfinancialservices/clock.png?h=512&w=512&hash=C9BD7D9DEE2903F440EEEF6EEC5DB66B")
          .headers(headers_1),
        http("request_73")
          .get("/-/media/images/navigation/file-signature.svg")
          .headers(headers_1),
        http("request_74")
          .get("/-/media/images/footer/polestarfinancialservices/logo-white.svg")
          .headers(headers_1),
        http("request_75")
          .get("/areas/polestarfinancialservices/scripts/vendors~main.bundle.js?v=1.0.7842.30659")
          .headers(headers_1),
        http("request_76")
          .get("/areas/polestarfinancialservices/scripts/main.bundle.js?v=1.0.7842.30659")
          .headers(headers_1),
        http("request_77")
          .get(uri1 + "?id=GTM-WFBMMPW")
          .headers(headers_1),
        http("request_78")
          .get("/areas/SETF/images/content-managed/vehicle/vehicle-1.svg")
          .headers(headers_1),
        http("request_79")
          .get("/areas/polestarfinancialservices/images/svgsheet.svg?v=1.0.7842.30659")
          .headers(headers_1)))
    .pause(5)
    /*.exec(http("request_80")
      .post("/rb_bf85681zfc?type=js&session=v_4_srv_7_sn_0B7A32009878319214A530B72D8449D7_perc_100000_ol_0_mul_1_app-3Afaf2468c809214d0_1_rcs-3Acss_0&svrid=7&flavor=post&visitID=ILMAUKAVMMPEKOWVKCDQRULSJPLFRUFF-0&modifiedSince=1624477596456&referer=https%3A%2F%2Fcm-polestarfinancialservices-uat.cld.jmfamily.com%2Fvehicle-settings%2Fchange-contact-info-form&app=faf2468c809214d0&crc=1761067479&end=1")
      .headers(headers_14)
      .body(RawFileBody("gatlingpractice/login10/0080_request.txt")))
    .pause(1)
    .exec(http("request_81")
      .post("/rb_bf85681zfc?type=js&session=v_4_srv_7_sn_0B7A32009878319214A530B72D8449D7_perc_100000_ol_0_mul_1_app-3Afaf2468c809214d0_1_rcs-3Acss_0&svrid=7&flavor=post&visitID=ILMAUKAVMMPEKOWVKCDQRULSJPLFRUFF-0&modifiedSince=1624477596456&referer=https%3A%2F%2Fcm-polestarfinancialservices-uat.cld.jmfamily.com%2Fvehicle-settings%2Fchange-contact-info-form&app=faf2468c809214d0&crc=1681260278&end=1")
      .headers(headers_14)
      .body(RawFileBody("gatlingpractice/login10/0081_request.txt")))
    .pause(36)*/
    .exec(http("TC05_S01_SETF_Customerwebsite_Login_logout")
      .get("/login/logout")
      .headers(headers_0)
      .check(status.is(200))
      .resources(http("request_83")
        .get(uri1 + "?id=GTM-WFBMMPW")
        .headers(headers_1),
        http("request_84")
          .get("/areas/polestarfinancialservices/images/svgsheet.svg?v=1.0.7842.30659")
          .headers(headers_1))
    )
  //.pause(1)
  /*.exec(http("request_85")
    .post("/rb_bf85681zfc?type=js&session=v_4_srv_7_sn_0B7A32009878319214A530B72D8449D7_perc_100000_ol_0_mul_1_app-3Afaf2468c809214d0_1_rcs-3Acss_0&svrid=7&flavor=post&visitID=ILMAUKAVMMPEKOWVKCDQRULSJPLFRUFF-0&modifiedSince=1624477596456&referer=https%3A%2F%2Fcm-polestarfinancialservices-uat.cld.jmfamily.com%2F&app=faf2468c809214d0&crc=854080954&end=1")
    .headers(headers_14)
    .body(RawFileBody("gatlingpractice/login10/0085_request.txt")))*/
  //.pause(1)
  /*.exec(http("request_86")
    .post("/rb_bf85681zfc?type=js&session=v_4_srv_7_sn_0B7A32009878319214A530B72D8449D7_perc_100000_ol_0_mul_1_app-3Afaf2468c809214d0_1_rcs-3Acss_0&svrid=7&flavor=post&visitID=ILMAUKAVMMPEKOWVKCDQRULSJPLFRUFF-0&modifiedSince=1624477596456&referer=https%3A%2F%2Fcm-polestarfinancialservices-uat.cld.jmfamily.com%2F&app=faf2468c809214d0&crc=536696445&end=1")
    .headers(headers_14)
    .body(RawFileBody("gatlingpractice/login10/0086_request.txt")))*/

  //setUp(scn.inject(constantConcurrentUsers(1) during(60.second))).maxDuration(1.minutes).protocols(httpProtocol)
  setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
    .assertions(global.responseTime.max.between(100, 5000),
      global.successfulRequests.percent.gt(95),
      global.failedRequests.percent.is(0),
      global.responseTime.percentile1.lt(1000),
      global.responseTime.percentile2.lt(1000))
    .assertions(forAll.responseTime.max.lt( 5000))
}

