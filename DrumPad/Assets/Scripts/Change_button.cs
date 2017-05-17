using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.SceneManagement;

public class Change_button : MonoBehaviour {

    Vector3 v;

    public void back_button()
    {
        SceneManager.LoadScene("Menu");
    }

    public void left_button()
    {
        Debug.Log("left");
        if (transform.position.z == 0)
        {
            v = transform.position;
            v.z = 2;
            transform.position = v;
        }
        else if (transform.position.z == 1)
        {
            v = transform.position;
            v.z = 0;
            transform.position = v;
        }
        else if (transform.position.z == 2)
        {
            v = transform.position;
            v.z = 1;
            transform.position = v;
        }
    }

    public void right_button()
    {
        if (transform.position.z == 0)
        {
            v = transform.position;
            v.z = 1;
            transform.position = v;
        }
        else if (transform.position.z == 1)
        {
            v = transform.position;
            v.z = 2;
            transform.position = v;
        }
        else if (transform.position.z == 2)
        {
            v = transform.position;
            v.z = 0;
            transform.position = v;
        }
    }
}