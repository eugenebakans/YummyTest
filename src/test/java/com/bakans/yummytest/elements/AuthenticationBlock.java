package com.bakans.yummytest.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.element.Link;
import ru.yandex.qatools.htmlelements.element.TextInput;

@Name("Authentication block")
@FindBy(xpath = "/html/body/div[1]/div/div")
public class AuthenticationBlock extends HtmlElement {

    @FindBy(xpath = "div[@class = 'login']")
    private Button loginButton;

    @FindBy(css = "body > div.top > div > div > div > form > input[type=\"text\"]:nth-child(1)")
    private TextInput emailField;

    @FindBy(css = "body > div.top > div > div > div > form > input[type=\"password\"]:nth-child(2)")
    private WebElement passwordField;

    @FindBy(css = "body > div.top > div > div > div > form > input.login")
    private Button signInButton;

    @FindBy(xpath = "a[@class='register']")
    private Link registerButton;

    public void signIn(String email, String pass){
        loginButton.click();
        emailField.clear();
        emailField.sendKeys(email);
        passwordField.clear();
        passwordField.sendKeys(pass);
        signInButton.click();
    }



}
