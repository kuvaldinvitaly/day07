package ru.lanit.atschool.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class MainPage extends BasePage {

    /**
     * Метод открывает браузер на заданной странице
     * страница задается в файле config.properties.
     */
    public void openPage(String url) {
        driver.get(url);
        logger.info("Выполнен вход на страницу: " + url);
    }

    /**
     * Переход на вкладку "Категории"
     */
    @FindBy(xpath = "//a[contains(text(),'Категории')]")
    public WebElement btnCategiries;

    /**
     * Переход на вкладку "Пользователи"
     */
    @FindBy(xpath = "//a[contains(text(),'Пользователи')]")
    public WebElement btnUsers;

    /**
     * Нажимаем на кнопку "поиск по сайту"
     */
    @FindBy(xpath = "//*[@href=\"/search/\"]")
    public WebElement btnSearch;

    /**
     * Нажимаем на поле поиска
     */
    @FindBy(xpath = "//*[@class=\"form-control\"]")
    public WebElement searchField;

    /**
     * нажимаем на "Показать полные результаты"
     */
    @FindBy(xpath = "//*[@class=\"dropdown-search-footer\"]")
    public WebElement btnShowFullSearchResults;

    /**
     * нажимаем кнопку "Регистрация"
     */
    @FindBy(xpath = "//*[@class=\"btn navbar-btn btn-primary btn-register\"]")
    public WebElement btnRegistration;

    /**
     * нажимаем на поле "Имя пользователя"
     */
    @FindBy (xpath = "//*[@class=\"btn btn-primary\"]")
    public WebElement clickToNameUser;

    /**
     * Нажимаем кнопку отмена
     */
    @FindBy (xpath = "//button[contains(text(),'Отмена')]")
    public WebElement btnCancellation;

    /**
     * Нажимаем на кнопку "Обновить страницу"
     */
    @FindBy (xpath = "//button[contains(text(),'Обновите страницу')]")
    public WebElement btnReloadField;


}

