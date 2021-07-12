package gatlingpractice

import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.core.session.Expression
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class RegistrationNew4 extends Simulation {

	val domain = "cm-polestarfinancialservices-uat.cld.jmfamily.com"
	val httpProtocol = http
		.baseUrl("https://" + domain)
		.inferHtmlResources(BlackList(""".*\.js""", """.*\.css""", """.*\.gif""", """.*\.jpeg""", """.*\.jpg""", """.*\.ico""", """.*\.woff""", """.*\.woff2""", """.*\.(t|o)tf""", """.*\.png""", """.*detectportal\.firefox\.com.*"""), WhiteList())
		.userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.106 Safari/537.36")

	val VerificationToken = regex("""<input name="__RequestVerificationToken" type="hidden" value="([^"]*)" />""")
		.saveAs("Token")

	val csvFeeder = csv("registration.csv").circular

	def jsfGet(name: String, url: Expression[String]) =
		http(name)
			.get(url)
			.check(VerificationToken)
			.check(status.is(200))

	def jsfPost(name: String, url: Expression[String]) = http(name)
		.post(url)
		.formParam("__RequestVerificationToken", "${Token}")
		.check(VerificationToken)
		.check(status.is(200))

	val headers_0 = Map(
		"accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"sec-ch-ua" -> """ Not;A Brand";v="99", "Google Chrome";v="91", "Chromium";v="91""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "document",
		"sec-fetch-mode" -> "navigate",
		"sec-fetch-site" -> "none",
		"sec-fetch-user" -> "?1",
		"upgrade-insecure-requests" -> "1")

	val headers_1 = Map(
		"sec-ch-ua" -> """ Not;A Brand";v="99", "Google Chrome";v="91", "Chromium";v="91""",
		"sec-ch-ua-mobile" -> "?0")

	val headers_13 = Map(
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"content-type" -> "text/plain;charset=UTF-8",
		"origin" -> "https://cm-polestarfinancialservices-uat.cld.jmfamily.com",
		"sec-ch-ua" -> """ Not;A Brand";v="99", "Google Chrome";v="91", "Chromium";v="91""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-origin")

	val headers_15 = Map(
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"content-type" -> "text/plain;charset=UTF-8",
		"origin" -> "https://cm-polestarfinancialservices-uat.cld.jmfamily.com",
		"sec-ch-ua" -> """ Not;A Brand";v="99", "Google Chrome";v="91", "Chromium";v="91""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "no-cors",
		"sec-fetch-site" -> "same-origin")

	val headers_16 = Map(
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

	val headers_27 = Map(
		"accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"origin" -> "https://cm-polestarfinancialservices-uat.cld.jmfamily.com",
		"sec-ch-ua" -> """ Not;A Brand";v="99", "Google Chrome";v="91", "Chromium";v="91""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "document",
		"sec-fetch-mode" -> "navigate",
		"sec-fetch-site" -> "same-origin",
		"sec-fetch-user" -> "?1",
		"upgrade-insecure-requests" -> "1")

    val uri2 = "https://www.googletagmanager.com/gtm.js"

	val scn = scenario("RegistrationNew4")
		.exec(http("Home")
			.get("/")
			.headers(headers_0)
			.resources(http("Home_1")
			.get("/-/media/images/header/polestarfinancialservices/logo.svg")
			.headers(headers_1),
            http("Home_2")
			.get("/-/media/images/benefits/volvocarfinancialservices/24-7_access.png?h=116&w=116&hash=6BF1150C2D4776EA955F3C1261C76287")
			.headers(headers_1),
            http("Home_3")
			.get("/-/media/images/benefits/volvocarfinancialservices/management.png?h=116&w=116&hash=C5403D99A8B6DD6AD431E97FF9B19516")
			.headers(headers_1),
            http("Home_4")
			.get("/-/media/images/benefits/volvocarfinancialservices/offers.png?h=116&w=116&hash=4FC8A10A03419B8F9BB20FF97330DE18")
			.headers(headers_1),
            http("Home_5")
			.get("/-/media/images/benefits/volvocarfinancialservices/alerts.png?h=116&w=116&hash=969B76BA7B2C4370DC0CD735A98BA053")
			.headers(headers_1),
            http("Home_6")
			.get("/-/media/images/footer/polestarfinancialservices/logo.svg?h=68&w=197&hash=44D1991D0BFFCFB1DD79DD58A4CD191C")
			.headers(headers_1),
            http("Home_7")
			.get("/areas/polestarfinancialservices/scripts/vendors~main.bundle.js?v=1.0.7842.30659")
			.headers(headers_1),
            http("Home_8")
			.get("/areas/polestarfinancialservices/scripts/main.bundle.js?v=1.0.7842.30659")
			.headers(headers_1),
            http("Home_9")
			.get(uri2 + "?id=GTM-WFBMMPW")
			.headers(headers_1),
            http("Home_10")
			.get("/-/media/images/contentblocks/polestarfinancialservices/homepage/ss-man-on-yellow-couch-reversed.jpg?h=720&w=1280&hash=0B7B09372AF5E43364D8BD8D3E0E2F4D")
			.headers(headers_1),
            http("Home_11")
			.get("/-/media/images/reusablecontent/cards/polestarfinancialservices/homepage/homepage-driving_in_parking_garage.jpg?h=720&w=1280&hash=25746D341779112417C22C0BE4F0AAA3")
			.headers(headers_1),
            http("Home_12")
			.get("/areas/polestarfinancialservices/images/svgsheet.svg?v=1.0.7842.30659")
			.headers(headers_1)))

		.pause(5)

		.exec(http("Home_13")
			.post("/rb_bf85681zfc?type=js&session=v_4_srv_7_sn_0B7A32009878319214A530B72D8449D7_perc_100000_ol_0_mul_1_app-3Afaf2468c809214d0_1_rcs-3Acss_0&svrid=7&flavor=post&visitID=ILMAUKAVMMPEKOWVKCDQRULSJPLFRUFF-0&modifiedSince=1624477596456&referer=https%3A%2F%2Fcm-polestarfinancialservices-uat.cld.jmfamily.com%2F&app=faf2468c809214d0&crc=2360459961&end=1")
			.headers(headers_13)
			.body(RawFileBody("gatlingpractice/registrationnew4/0013_request.txt")))

		.pause(5)

		.exec(http("Home_14")
			.post("/rb_bf85681zfc?type=js&session=v_4_srv_7_sn_0B7A32009878319214A530B72D8449D7_perc_100000_ol_0_mul_1_app-3Afaf2468c809214d0_1_rcs-3Acss_0&svrid=7&flavor=post&visitID=ILMAUKAVMMPEKOWVKCDQRULSJPLFRUFF-0&modifiedSince=1624477596456&referer=https%3A%2F%2Fcm-polestarfinancialservices-uat.cld.jmfamily.com%2F&app=faf2468c809214d0&crc=3385038734&end=1")
			.headers(headers_13)
			.body(RawFileBody("gatlingpractice/registrationnew4/0014_request.txt")))

		.pause(5)

		.exec(http("Home_15")
			.post("/rb_bf85681zfc?type=js&session=v_4_srv_7_sn_0B7A32009878319214A530B72D8449D7_perc_100000_ol_0_mul_1_app-3Afaf2468c809214d0_1_rcs-3Acss_0&svrid=7&flavor=post&visitID=ILMAUKAVMMPEKOWVKCDQRULSJPLFRUFF-0&modifiedSince=1624477596456&referer=https%3A%2F%2Fcm-polestarfinancialservices-uat.cld.jmfamily.com%2F&app=faf2468c809214d0&crc=2952730418&end=1")
			.headers(headers_15)
			.body(RawFileBody("gatlingpractice/registrationnew4/0015_request.txt"))
			.resources(http("Home_click_register")
			.get("/registration")
			.headers(headers_16),
            http("Home_click_register_1")
			.get("/-/media/images/header/polestarfinancialservices/logo.svg")
			.headers(headers_1),
            http("Home_click_register_2")
			.get("/-/media/images/footer/polestarfinancialservices/logo.svg?h=68&w=197&hash=44D1991D0BFFCFB1DD79DD58A4CD191C")
			.headers(headers_1),
            http("Home_click_register_3")
			.get("/areas/polestarfinancialservices/scripts/vendors~main.bundle.js?v=1.0.7842.30659")
			.headers(headers_1),
            http("Home_click_Register_4")
			.get("/areas/polestarfinancialservices/scripts/main.bundle.js?v=1.0.7842.30659")
			.headers(headers_1),
            http("Home_click_register_5")
			.get(uri2 + "?id=GTM-WFBMMPW")
			.headers(headers_1),
            http("Home_click_register_6")
			.get("/areas/polestarfinancialservices/content/styles.css?v=1.0.7842.30659")
			.headers(headers_1),
            http("Home_click_register_7")
			.get("/-/media/images/contentblocks/polestarfinancialservices/modules/as-woman-on-laptop.jpg?h=720&w=1280&hash=FF43E8C2A691B9596D49CC8A794B7F78")
			.headers(headers_1),
            http("Home_click_register_8")
			.get("/areas/polestarfinancialservices/images/svgsheet.svg?v=1.0.7842.30659")
			.headers(headers_1)))

		.pause(5)

		.exec(http("Home_click_register_9")
			.post("/rb_bf85681zfc?type=js&session=v_4_srv_7_sn_0B7A32009878319214A530B72D8449D7_perc_100000_ol_0_mul_1_app-3Afaf2468c809214d0_1_rcs-3Acss_0&svrid=7&flavor=post&visitID=ILMAUKAVMMPEKOWVKCDQRULSJPLFRUFF-0&modifiedSince=1624477596456&referer=https%3A%2F%2Fcm-polestarfinancialservices-uat.cld.jmfamily.com%2Fregistration&app=faf2468c809214d0&crc=3965860661&end=1")
			.headers(headers_13)
			.body(RawFileBody("gatlingpractice/registrationnew4/0025_request.txt")))

		.pause(5)

		.exec(http("Home_click_register_10")
			.post("/rb_bf85681zfc?type=js&session=v_4_srv_7_sn_0B7A32009878319214A530B72D8449D7_perc_100000_ol_0_mul_1_app-3Afaf2468c809214d0_1_rcs-3Acss_0&svrid=7&flavor=post&visitID=ILMAUKAVMMPEKOWVKCDQRULSJPLFRUFF-0&modifiedSince=1624477596456&referer=https%3A%2F%2Fcm-polestarfinancialservices-uat.cld.jmfamily.com%2Fregistration&app=faf2468c809214d0&crc=3465791616&end=1")
			.headers(headers_13)
			.body(RawFileBody("gatlingpractice/registrationnew4/0026_request.txt")))

		.pause(5)

		.feed(csvFeeder)
		.exec(http("Registration")
			.post("/registration")
			.headers(headers_27)
			.formParam("username", "${userid}")
			.formParam("email", "${emailid}")
			.formParam("confirmEmail", "${confirmemailid}")
			.formParam("password", "${pass}")
			.formParam("confirmPassword", "${cpass}")
			.formParam("acceptTerms", "true")
			.resources(http("Registration_button_click")
			.get(uri2 + "?id=GTM-WFBMMPW")
			.headers(headers_1),
            http("Registration_button_click_1")
			.get("/areas/polestarfinancialservices/images/svgsheet.svg?v=1.0.7842.30659")
			.headers(headers_1)))

		.pause(5)

		.exec(http("Registration_Pending")
			.post("/rb_bf85681zfc?type=js&session=v_4_srv_7_sn_0B7A32009878319214A530B72D8449D7_perc_100000_ol_0_mul_1_app-3Afaf2468c809214d0_1_rcs-3Acss_0&svrid=7&flavor=post&visitID=ILMAUKAVMMPEKOWVKCDQRULSJPLFRUFF-0&modifiedSince=1624477596456&referer=https%3A%2F%2Fcm-polestarfinancialservices-uat.cld.jmfamily.com%2Fregistration%2Fpending&app=faf2468c809214d0&crc=1096542790&end=1")
			.headers(headers_13)
			.body(RawFileBody("gatlingpractice/registrationnew4/0030_request.txt"))
			.check(regex("""A verification link has been sent to your email.""")))

		.pause(5)

		.exec(http("Registration_Pending_1")
			.post("/rb_bf85681zfc?type=js&session=v_4_srv_7_sn_0B7A32009878319214A530B72D8449D7_perc_100000_ol_0_mul_1_app-3Afaf2468c809214d0_1_rcs-3Acss_0&svrid=7&flavor=post&visitID=ILMAUKAVMMPEKOWVKCDQRULSJPLFRUFF-0&modifiedSince=1624477596456&referer=https%3A%2F%2Fcm-polestarfinancialservices-uat.cld.jmfamily.com%2Fregistration%2Fpending&app=faf2468c809214d0&crc=28768124&end=1")
			.headers(headers_13)
			.body(RawFileBody("gatlingpractice/registrationnew4/0031_request.txt"))
			.check(regex("""A verification link has been sent to your email.""")))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
		.assertions(global.responseTime.max.between(100, 5000),
			global.successfulRequests.percent.gt(95),
			global.failedRequests.percent.is(0),
			global.responseTime.percentile1.lt(1000),
			global.responseTime.percentile2.lt(1000))
		.assertions(forAll.responseTime.max.lt( 5000))
}