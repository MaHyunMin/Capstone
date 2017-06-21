using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.SceneManagement;

public class tutorial1 : MonoBehaviour {

    private GameObject note;
    private GameObject name;
    float[] vy = new float[5] { -0.7f, 0.25f, -0.2f, 0.73f, 0.5f }; // base, snare, floor, tom1, tom2
    int i = 0;
    Vector3 v;

    Sprite sp;

    // Use this for initialization
    void Start () {
		if(note == null)
        {
            note = GameObject.FindGameObjectWithTag("Note");
        }

        if(name == null)
        {
            name = GameObject.FindGameObjectWithTag("Name");
        }
        
        v = note.transform.localPosition;
        v.x = 0;
        v.y = vy[0];
        v.z = -1;

        sp = (Sprite)Resources.Load("Image/name" + i, typeof(Sprite));
        name.GetComponent<SpriteRenderer>().sprite = sp;
    }

    public void backScene()
    {
        SceneManager.LoadScene("Menu");
    }

    public void leftClick()
    {
        if(i == 0)
        {
            i = 4;
            v.y = vy[i];
            note.transform.position = v;
            sp = (Sprite)Resources.Load("Image/name" + i, typeof(Sprite));
            name.GetComponent<SpriteRenderer>().sprite = sp;
        }
        else
        {
            i--;
            v.y = vy[i];
            note.transform.position = v;
            sp = (Sprite)Resources.Load("Image/name" + i, typeof(Sprite));
            name.GetComponent<SpriteRenderer>().sprite = sp;
        }
    }

    public void rightClick()
    {
        if(i == 4)
        {
            i = 0;
            v.y = vy[i];
            note.transform.position = v;
            sp = (Sprite)Resources.Load("Image/name" + i, typeof(Sprite));
            name.GetComponent<SpriteRenderer>().sprite = sp;
        }
        else
        {
            i++;
            v.y = vy[i];
            note.transform.position = v;
            sp = (Sprite)Resources.Load("Image/name" + i, typeof(Sprite));
            name.GetComponent<SpriteRenderer>().sprite = sp;
        }
    }
}
