using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.SceneManagement;

public class Tutorial : MonoBehaviour {

	public void Back_button()
    {
        SceneManager.LoadScene("Menu");
    }

    public void Menu1_button()
    {
        SceneManager.LoadScene("Tutorial1");
    }
}
