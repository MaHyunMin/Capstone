using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.SceneManagement;

public class menu : MonoBehaviour {
	
	public void changeScene1(){
		SceneManager.LoadScene ("Tutorial1");
	}

	public void changeScene2(){
		SceneManager.LoadScene ("Tutorial2");
	}

	public void changeScene3(){
		SceneManager.LoadScene ("Tutorial1_1");
	}

    public void changeScene4()
    {
        SceneManager.LoadScene("Tutorial2_1");
    }

    public void exitScene(){
		Application.Quit();
	}
}
