# Mobile Automation Testing with Appium

## Appium
Appium adalah Mobile web, native dan hybrid software application test automation tool. Open-source a.k.a Gratisan software automation tool, Biasanya banyak digunakan untuk android dan IOS platform aplikasi. Yang paling penting adalah Appium bisa “cross-platform” automation tool , Jadi kalian bisa membuat software automatios test script di IOS dan Android menggunakan API yang sama.

### Appium High Level Architecture
* Iphone with XCUITest
* Android with UIAutomator2/Espreso
* Windows with WinAppDriver

### Appium Components
1. Appium Server : Appium Server digunakan sebagai jembatan untuk mengontrol perangkat pengujian. Ada dua
versi, kita dapat menggunakan appium desktop atau menginstall perintah appium menggunakan pm
2. Appium Client : Library yang ditulis dalam beberapa bahasa untuk membuat test script sehingga kita bisa mengirimkan
perintah ke server appium

### Installing Appium until Running Appium
#### Prerequisites : 
* Java JDK 8/11
* Android SDK
* Appium Dekstop
* Node JS
* appium-doctor
#### Running Appium
1. Conneting the Devices
   * Untuk Real Device, install device driver terlebih dahulu
   * Untuk Emulator, buat dengan menggunakan android studio
2. Checking the Connected Devices
   * Jalankan adb devices di cmd kemudian lihat UDID dan device name
3. Running Appium Dekstop
4. Using Appium Inspector
5. Desired Capabilities
   * Digunakan untuk mengatur device apa yang akan ditest
6. Filing the Capabilities
   * platfromName
   * deviceName
   * udid
   * app
   * automationName
   * noReset
7. Appium Inspector
8. Appium Locators
   * ID
   * Class Name
   * Xpath
   * Accessibility ID
   * Android UI Automator
   * Android View Tag
   * iOS UI Automation
   * contoh : `<android. widget. ImageButton content-desc= "Open navigation drawer" resource-id-"com. isl. simpleapp: id/et 1">`

## Project Initialization & Appium Basic Action
### Project Initialization
1. Using Maven Archetype
   * add dependencies
   * download serenity cucumber mvn repository
2. Adding Appium Java client
   * add java client dependency
### Appium bacis action and cucumer
1. Cucumber Frameworks
   * Using gherkin syntax
2. Adding Feature Files
3. Mapping Every Scenario Steps on Steps Class
4. Initializing the Appium
5. Adding Desired Capabilities
   * contoh : &lt; DesiredCapabilities caps = new DesiredCapabilities();caps.setCapability ("platformName", "Android");//another capabilities&gt;
6. Initialize the Appium
   > - `try {
    AndroidDriver<AndroidElement> androidDriver = new
    AndroidDriver<> (new URL ("http://0.0.0.0:4723/wd/hub/"), caps);
    } catch (MalformedURLException e){
        e.printStackTrace () ;
    }`
7. Cucumber Hooks
8. Page Object Design Pattern
9. Function Methods
    > - `by` Object and `findElement()`
    > - `sendKeys()` and `clear()`
    > - `click()`
    > - `get()`
    > - `isDiplayed()`
9. Perform Assertions
10. Mapping The Page Object to Steps Class
11. Cucumber Tags

## Appium Complex Actios & Maximizing the Project Structure
1. Working with Wait
2. The BasePageObject class
3. Performing complex actions
4. Taking Screenshot
5. Configuration file


