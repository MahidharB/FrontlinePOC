package computerdatabase
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import scala.concurrent.duration._

class Petstoreflownew extends Simulation {

	val httpProtocol = http
		.baseUrl("http://petstore.smartload.io")
		.inferHtmlResources()
		.silentResources
	val headers_0 = Map("User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/90.0.4430.93 Safari/537.36")

	val headers_2 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
		"Accept-Encoding" -> "gzip, deflate",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Cache-Control" -> "max-age=0",
		"Upgrade-Insecure-Requests" -> "1",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/90.0.4430.93 Safari/537.36")

	val headers_4 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Accept-Encoding" -> "gzip, deflate",
		"Accept-Language" -> "en-US,en;q=0.9",
		"If-Modified-Since" -> "Mon, 11 Jun 2018 14:04:06 GMT",
		"If-None-Match" -> """W/"1024-1528725846000"""",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/90.0.4430.93 Safari/537.36")

	val headers_6 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Accept-Encoding" -> "gzip, deflate",
		"Accept-Language" -> "en-US,en;q=0.9",
		"If-Modified-Since" -> "Mon, 11 Jun 2018 14:04:06 GMT",
		"If-None-Match" -> """W/"828-1528725846000"""",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/90.0.4430.93 Safari/537.36")

	val headers_11 = Map(
		"Accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Cache-Control" -> "no-cache",
		"Pragma" -> "no-cache",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/90.0.4430.93 Safari/537.36")

	val headers_26 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
		"Accept-Encoding" -> "gzip, deflate",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Cache-Control" -> "max-age=0",
		"Origin" -> "http://petstore.smartload.io",
		"Upgrade-Insecure-Requests" -> "1",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/90.0.4430.93 Safari/537.36")

	val headers_40 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Origin" -> "http://petstore.smartload.io",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/90.0.4430.93 Safari/537.36")

	val headers_55 = Map(
		"Accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate",
		"Accept-Language" -> "en-US,en;q=0.9",
		"If-Modified-Since" -> "Mon, 11 Jun 2018 14:04:06 GMT",
		"If-None-Match" -> """W/"711-1528725846000"""",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/90.0.4430.93 Safari/537.36")

	val headers_70 = Map(
		"Accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate",
		"Accept-Language" -> "en-US,en;q=0.9",
		"If-Modified-Since" -> "Mon, 11 Jun 2018 14:04:06 GMT",
		"If-None-Match" -> """W/"685-1528725846000"""",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/90.0.4430.93 Safari/537.36")

	val headers_71 = Map(
		"Accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate",
		"Accept-Language" -> "en-US,en;q=0.9",
		"If-Modified-Since" -> "Mon, 11 Jun 2018 14:04:06 GMT",
		"If-None-Match" -> """W/"742-1528725846000"""",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/90.0.4430.93 Safari/537.36")

	val headers_72 = Map(
		"Accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate",
		"Accept-Language" -> "en-US,en;q=0.9",
		"If-Modified-Since" -> "Mon, 11 Jun 2018 14:04:06 GMT",
		"If-None-Match" -> """W/"763-1528725846000"""",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/90.0.4430.93 Safari/537.36")



	val scn = scenario("Petstoreflownew")
		/*.exec(http("request_0")
			.get("/applicationPetstore/javax.faces.resource/theme.css.xhtml?ln=primefaces-bootstrap")
			.headers(headers_0)
			.resources(http("request_1")
			.get("/applicationPetstore/javax.faces.resource/fa/font-awesome.css.xhtml?ln=primefaces&v=6.1")
			.headers(headers_0),
            http("request_2")
			.get("/applicationPetstore/shopping/signon.xhtml")
							.check(css("input[name='javax.faces.ViewState']", nodeAttribute="value").saveAs(key = "viewstate"))
			.headers(headers_2),
            http("request_3")
			.get("/applicationPetstore/javax.faces.resource/fa/fontawesome-webfont.woff2.xhtml?ln=primefaces&v=6.1?v=4.7.0"),
            http("request_4")
			.get("/applicationPetstore/javax.faces.resource/css/style.css.xhtml")
			.headers(headers_4),
            http("request_5")
			.get("/applicationPetstore/javax.faces.resource/fontawesome/4.7.0/css/font-awesome.css.xhtml?ln=webjars")
			.headers(headers_0),
            http("request_6")
			.get("/applicationPetstore/javax.faces.resource/css/sticky-footer-navbar.css.xhtml")
			.headers(headers_6),
            http("request_7")
			.get("/applicationPetstore/javax.faces.resource/jsf.js.xhtml?ln=javax.faces")
			.headers(headers_0),
            http("request_8")
			.get("/applicationPetstore/javax.faces.resource/bootstrap/3.3.7-1/js/bootstrap.min.js.xhtml?ln=webjars")
			.headers(headers_0),
            http("request_9")
			.get("/applicationPetstore/javax.faces.resource/bootstrap/3.3.7-1/css/bootstrap.min.css.xhtml?ln=webjars")
			.headers(headers_0),
            http("request_10")
			.get("/applicationPetstore/javax.faces.resource/jquery/2.2.4/jquery.min.js.xhtml?ln=webjars")
			.headers(headers_0),
            http("request_11")
			.get("/applicationPetstore/javax.faces.resource/favicon.gif.xhtml")
			.headers(headers_11),
            http("request_12")
			.get("/applicationPetstore/javax.faces.resource/favicon.gif.xhtml")
			.headers(headers_0)))
		.pause(5)*/
		.exec(http("HomePage")
			.get("/applicationPetstore/shopping/signon.xhtml")
			.check(css("input[name='javax.faces.ViewState']", nodeAttribute="value").saveAs(key = "viewstate"))
			.headers(headers_2)
			.resources(http("request_14")
			.get("/applicationPetstore/javax.faces.resource/theme.css.xhtml?ln=primefaces-bootstrap")
			.headers(headers_0),
            http("request_15")
			.get("/applicationPetstore/javax.faces.resource/fa/font-awesome.css.xhtml?ln=primefaces&v=6.1")
			.headers(headers_0),
            http("request_16")
			.get("/applicationPetstore/javax.faces.resource/bootstrap/3.3.7-1/css/bootstrap.min.css.xhtml?ln=webjars")
			.headers(headers_0),
            http("request_17")
			.get("/applicationPetstore/javax.faces.resource/fontawesome/4.7.0/css/font-awesome.css.xhtml?ln=webjars")
			.headers(headers_0),
            http("request_18")
			.get("/applicationPetstore/javax.faces.resource/jsf.js.xhtml?ln=javax.faces")
			.headers(headers_0),
            http("request_19")
			.get("/applicationPetstore/javax.faces.resource/jquery/2.2.4/jquery.min.js.xhtml?ln=webjars")
			.headers(headers_0),
            http("request_20")
			.get("/applicationPetstore/javax.faces.resource/bootstrap/3.3.7-1/js/bootstrap.min.js.xhtml?ln=webjars")
			.headers(headers_0),
            http("request_21")
			.get("/applicationPetstore/javax.faces.resource/css/style.css.xhtml")
			.headers(headers_4),
            http("request_22")
			.get("/applicationPetstore/javax.faces.resource/css/sticky-footer-navbar.css.xhtml")
			.headers(headers_6),
            http("request_23")
			.get("/applicationPetstore/javax.faces.resource/fa/fontawesome-webfont.woff2.xhtml?ln=primefaces&v=6.1?v=4.7.0"),
            http("request_24")
			.get("/applicationPetstore/javax.faces.resource/favicon.gif.xhtml")
			.headers(headers_11),
            http("request_25")
			.get("/applicationPetstore/javax.faces.resource/favicon.gif.xhtml")
			.headers(headers_0)))
		.pause(8)
		.exec(http("Login")
			.post("/applicationPetstore/shopping/signon.xhtml")
			.headers(headers_26)
			.formParam("j_idt72", "j_idt72")
			.formParam("j_idt72:login", "Demo1")
			.formParam("j_idt72:password", "Demo")
			.formParam("j_idt72:j_idt77", "Sign In")
			.formParam("javax.faces.ViewState", "${viewstate}")//691872330298677227:-9169167364542323660
			.resources(http("request_27")
			.get("/applicationPetstore/javax.faces.resource/theme.css.xhtml?ln=primefaces-bootstrap")
			.headers(headers_0),
            http("request_28")
			.get("/applicationPetstore/javax.faces.resource/fa/font-awesome.css.xhtml?ln=primefaces&v=6.1")
			.headers(headers_0),
            http("request_29")
			.get("/applicationPetstore/javax.faces.resource/bootstrap/3.3.7-1/css/bootstrap.min.css.xhtml?ln=webjars")
			.headers(headers_0),
            http("request_30")
			.get("/applicationPetstore/javax.faces.resource/fontawesome/4.7.0/css/font-awesome.css.xhtml?ln=webjars")
			.headers(headers_0),
            http("request_31")
			.get("/applicationPetstore/javax.faces.resource/jsf.js.xhtml?ln=javax.faces")
			.headers(headers_0),
            http("request_32")
			.get("/applicationPetstore/javax.faces.resource/jquery/2.2.4/jquery.min.js.xhtml?ln=webjars")
			.headers(headers_0),
            http("request_33")
			.get("/applicationPetstore/javax.faces.resource/bootstrap/3.3.7-1/js/bootstrap.min.js.xhtml?ln=webjars")
			.headers(headers_0),
            http("request_34")
			.get("/applicationPetstore/javax.faces.resource/css/sticky-footer-navbar.css.xhtml")
			.headers(headers_6),
            http("request_35")
			.get("/applicationPetstore/javax.faces.resource/css/style.css.xhtml")
			.headers(headers_4),
            http("request_36")
			.get("/applicationPetstore/javax.faces.resource/fa/fontawesome-webfont.woff2.xhtml?ln=primefaces&v=6.1?v=4.7.0"),
            http("request_37")
			.get("/applicationPetstore/javax.faces.resource/splash.gif.xhtml")
			.headers(headers_0)))
		.pause(4)
		.exec(http("request_38")
			.get("/applicationPetstore/javax.faces.resource/fa/fontawesome-webfont.woff2.xhtml?ln=primefaces&v=6.1?v=4.7.0")
			.resources(http("request_39")
			.get("/applicationPetstore/javax.faces.resource/fa/fontawesome-webfont.woff2.xhtml?ln=primefaces&v=6.1?v=4.7.0"),
            http("request_40")
			.get("/applicationPetstore/javax.faces.resource/fontawesome/4.7.0/fonts/fontawesome-webfont.woff2?v=4.7.0")
			.headers(headers_40)
			.check(status.is(404)),
            http("request_41")
			.get("/applicationPetstore/javax.faces.resource/fontawesome/4.7.0/fonts/fontawesome-webfont.woff?v=4.7.0")
			.headers(headers_40)
			.check(status.is(404)),
            http("request_42")
			.get("/applicationPetstore/javax.faces.resource/fontawesome/4.7.0/fonts/fontawesome-webfont.ttf?v=4.7.0")
			.headers(headers_40)
			.check(status.is(404))))
		.pause(3)
		.exec(http("Search Poodle")
			.post("/applicationPetstore/shopping/main.xhtml")
			.headers(headers_26)
			.formParam("j_idt13", "j_idt13")
			.formParam("j_idt13:j_idt39", "Poodle")
			.formParam("j_idt13:j_idt42", "Search")
			.formParam("javax.faces.ViewState", "${viewstate}")//691872330298677227:1582421927573671340
			.resources(http("request_44")
			.get("/applicationPetstore/javax.faces.resource/theme.css.xhtml?ln=primefaces-bootstrap")
			.headers(headers_0),
            http("request_45")
			.get("/applicationPetstore/javax.faces.resource/fa/font-awesome.css.xhtml?ln=primefaces&v=6.1")
			.headers(headers_0),
            http("request_46")
			.get("/applicationPetstore/javax.faces.resource/bootstrap/3.3.7-1/css/bootstrap.min.css.xhtml?ln=webjars")
			.headers(headers_0),
            http("request_47")
			.get("/applicationPetstore/javax.faces.resource/fontawesome/4.7.0/css/font-awesome.css.xhtml?ln=webjars")
			.headers(headers_0),
            http("request_48")
			.get("/applicationPetstore/javax.faces.resource/jsf.js.xhtml?ln=javax.faces")
			.headers(headers_0),
            http("request_49")
			.get("/applicationPetstore/javax.faces.resource/jquery/2.2.4/jquery.min.js.xhtml?ln=webjars")
			.headers(headers_0),
            http("request_50")
			.get("/applicationPetstore/javax.faces.resource/bootstrap/3.3.7-1/js/bootstrap.min.js.xhtml?ln=webjars")
			.headers(headers_0),
            http("request_51")
			.get("/applicationPetstore/javax.faces.resource/css/sticky-footer-navbar.css.xhtml")
			.headers(headers_6),
            http("request_52")
			.get("/applicationPetstore/javax.faces.resource/css/style.css.xhtml")
			.headers(headers_4),
            http("request_53")
			.get("/applicationPetstore/javax.faces.resource/fa/fontawesome-webfont.woff2.xhtml?ln=primefaces&v=6.1?v=4.7.0"),
            http("request_54")
			.get("/applicationPetstore/resources/images/dog2.jpg")
			.headers(headers_0),
            http("request_55")
			.get("/applicationPetstore/javax.faces.resource/icons/cart_add.png.xhtml")
			.headers(headers_55),
            http("request_56")
			.get("/applicationPetstore/javax.faces.resource/fontawesome/4.7.0/fonts/fontawesome-webfont.woff2?v=4.7.0")
			.headers(headers_40)
			.check(status.is(404)),
            http("request_57")
			.get("/applicationPetstore/javax.faces.resource/fontawesome/4.7.0/fonts/fontawesome-webfont.woff?v=4.7.0")
			.headers(headers_40)
			.check(status.is(404)),
            http("request_58")
			.get("/applicationPetstore/javax.faces.resource/fontawesome/4.7.0/fonts/fontawesome-webfont.ttf?v=4.7.0")
			.headers(headers_40)
			.check(status.is(404))))
		.pause(2)
		.exec(http("Add to cart")
			.post("/applicationPetstore/shopping/searchresult.xhtml")
			.headers(headers_26)
			.formParam("j_idt72:0:j_idt89", "j_idt72:0:j_idt89")
			.formParam("javax.faces.ViewState", "${viewstate}")//691872330298677227:-3976108299398271641
			.formParam("j_idt72:0:j_idt89:j_idt90", "j_idt72:0:j_idt89:j_idt90")
			.formParam("itemId", "1010")
			.resources(http("request_60")
			.get("/applicationPetstore/javax.faces.resource/theme.css.xhtml?ln=primefaces-bootstrap")
			.headers(headers_0),
            http("request_61")
			.get("/applicationPetstore/javax.faces.resource/fa/font-awesome.css.xhtml?ln=primefaces&v=6.1")
			.headers(headers_0),
            http("request_62")
			.get("/applicationPetstore/javax.faces.resource/bootstrap/3.3.7-1/css/bootstrap.min.css.xhtml?ln=webjars")
			.headers(headers_0),
            http("request_63")
			.get("/applicationPetstore/javax.faces.resource/fontawesome/4.7.0/css/font-awesome.css.xhtml?ln=webjars")
			.headers(headers_0),
            http("request_64")
			.get("/applicationPetstore/javax.faces.resource/jsf.js.xhtml?ln=javax.faces")
			.headers(headers_0),
            http("request_65")
			.get("/applicationPetstore/javax.faces.resource/jquery/2.2.4/jquery.min.js.xhtml?ln=webjars")
			.headers(headers_0),
            http("request_66")
			.get("/applicationPetstore/javax.faces.resource/bootstrap/3.3.7-1/js/bootstrap.min.js.xhtml?ln=webjars")
			.headers(headers_0),
            http("request_67")
			.get("/applicationPetstore/javax.faces.resource/css/style.css.xhtml")
			.headers(headers_4),
            http("request_68")
			.get("/applicationPetstore/javax.faces.resource/css/sticky-footer-navbar.css.xhtml")
			.headers(headers_6),
            http("request_69")
			.get("/applicationPetstore/javax.faces.resource/fa/fontawesome-webfont.woff2.xhtml?ln=primefaces&v=6.1?v=4.7.0"),
            http("request_70")
			.get("/applicationPetstore/javax.faces.resource/icons/arrow_refresh.png.xhtml")
			.headers(headers_70),
            http("request_71")
			.get("/applicationPetstore/javax.faces.resource/icons/cart_delete.png.xhtml")
			.headers(headers_71),
            http("request_72")
			.get("/applicationPetstore/javax.faces.resource/icons/cart_go.png.xhtml")
			.headers(headers_72),
            http("request_73")
			.get("/applicationPetstore/javax.faces.resource/fontawesome/4.7.0/fonts/fontawesome-webfont.woff2?v=4.7.0")
			.headers(headers_40)
			.check(status.is(404)),
            http("request_74")
			.get("/applicationPetstore/javax.faces.resource/fontawesome/4.7.0/fonts/fontawesome-webfont.woff?v=4.7.0")
			.headers(headers_40)
			.check(status.is(404)),
            http("request_75")
			.get("/applicationPetstore/javax.faces.resource/fontawesome/4.7.0/fonts/fontawesome-webfont.ttf?v=4.7.0")
			.headers(headers_40)
			.check(status.is(404))))
		.pause(2)
		.exec(http("Logout")
			.post("/applicationPetstore/shopping/showcart.xhtml?cid=1")
			.headers(headers_26)
			.formParam("j_idt13", "j_idt13")
			.formParam("j_idt13:j_idt39", "Poodle")
			.formParam("javax.faces.ViewState", "${viewstate}")//691872330298677227:7550020849620987793
			.formParam("j_idt13:j_idt29", "j_idt13:j_idt29")
			.resources(http("request_77")
			.get("/applicationPetstore/javax.faces.resource/theme.css.xhtml?ln=primefaces-bootstrap")
			.headers(headers_0),
            http("request_78")
			.get("/applicationPetstore/javax.faces.resource/fa/font-awesome.css.xhtml?ln=primefaces&v=6.1")
			.headers(headers_0),
            http("request_79")
			.get("/applicationPetstore/javax.faces.resource/bootstrap/3.3.7-1/css/bootstrap.min.css.xhtml?ln=webjars")
			.headers(headers_0),
            http("request_80")
			.get("/applicationPetstore/javax.faces.resource/fontawesome/4.7.0/css/font-awesome.css.xhtml?ln=webjars")
			.headers(headers_0),
            http("request_81")
			.get("/applicationPetstore/javax.faces.resource/jsf.js.xhtml?ln=javax.faces")
			.headers(headers_0),
            http("request_82")
			.get("/applicationPetstore/javax.faces.resource/splash.gif.xhtml")
			.headers(headers_0),
            http("request_83")
			.get("/applicationPetstore/javax.faces.resource/jquery/2.2.4/jquery.min.js.xhtml?ln=webjars")
			.headers(headers_0),
            http("request_84")
			.get("/applicationPetstore/javax.faces.resource/bootstrap/3.3.7-1/js/bootstrap.min.js.xhtml?ln=webjars")
			.headers(headers_0),
            http("request_85")
			.get("/applicationPetstore/javax.faces.resource/css/style.css.xhtml")
			.headers(headers_4),
            http("request_86")
			.get("/applicationPetstore/javax.faces.resource/css/sticky-footer-navbar.css.xhtml")
			.headers(headers_6),
            http("request_87")
			.get("/applicationPetstore/javax.faces.resource/fa/fontawesome-webfont.woff2.xhtml?ln=primefaces&v=6.1?v=4.7.0"),
            http("request_88")
			.get("/applicationPetstore/javax.faces.resource/fontawesome/4.7.0/fonts/fontawesome-webfont.woff2?v=4.7.0")
			.headers(headers_40)
			.check(status.is(404)),
            http("request_89")
			.get("/applicationPetstore/javax.faces.resource/fontawesome/4.7.0/fonts/fontawesome-webfont.woff?v=4.7.0")
			.headers(headers_40)
			.check(status.is(404)),
            http("request_90")
			.get("/applicationPetstore/javax.faces.resource/fontawesome/4.7.0/fonts/fontawesome-webfont.ttf?v=4.7.0")
			.headers(headers_40)
			.check(status.is(404))))

	//setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)

		/*setUp(
			scn.inject(
				nothingFor(4.seconds), // 1
				//atOnceUsers(10), // 2
				//rampUsers(10).during(5.seconds), // 3
				constantUsersPerSec(1).during(120.seconds) // 4
				//constantUsersPerSec(20).during(15.seconds).randomized, // 5
				//rampUsersPerSec(10).to(20).during(10.minutes), // 6
				//rampUsersPerSec(10).to(20).during(10.minutes).randomized, // 7
				//heavisideUsers(1000).during(20.seconds) // 8
			).protocols(httpProtocol)
		)*/

	setUp(
		scn.inject(constantConcurrentUsers(15) during(120 second ))).maxDuration(2.minutes)
			//atOnceUsers(1),
			//rampUsers(1) during (30 second)
		.protocols(httpProtocol)

	//).maxDuration(2 minute)
			//rampConcurrentUsers(10).to(20).during(10.seconds) // 2


	/*setUp(
		scn.inject(constantUsersPerSec(1)during(120))
			).protocols(httpProtocol)*/

		.assertions(
			global.responseTime.max.lt(1000),
			global.successfulRequests.percent.gt(99),
			forAll.failedRequests.percent.lte(1),
			global.responseTime.percentile1.lt(1000),
			global.responseTime.percentile2.lt(1000),
			global.responseTime.percentile3.lt(1000),
			global.responseTime.percentile4.lt(1000)

		)


		//rampConcurrentUsers(10).to(20).during(10.seconds) // 2

}