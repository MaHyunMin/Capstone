using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.SceneManagement;

public class tutorial1_1 : MonoBehaviour {

    private GameObject note;
    private GameObject n;
    float[] vy = new float[4] { 1.5f, 1.5f, 1.5f, 1.3f }; // crash, hihat1, hihat2, ride
    int i = 0;
    Vector3 v;

    Sprite sp;
    Sprite note_sp;

    // Use this for initialization
    void Start()
    {
        if (note == null)
        {
            note = GameObject.FindGameObjectWithTag("Note");
        }

        if (n == null)
        {
            n = GameObject.FindGameObjectWithTag("Name");
        }

        v = note.transform.localPosition;
        v.x = 0;
        v.y = vy[0];
        v.z = -1;

        sp = (Sprite)Resources.Load("Image/name" + (i+11), typeof(Sprite));
        n.GetComponent<SpriteRenderer>().sprite = sp;

        note_sp = (Sprite)Resources.Load("Image/note" + (i + 11), typeof(Sprite));
        note.GetComponent<SpriteRenderer>().sprite = note_sp;
    }

    public void backScene()
    {
        SceneManager.LoadScene("Menu");
    }

    public void leftClick()
    {
        if (i == 0)
        {
            i = 3;
            v.y = vy[i];
            note.transform.position = v;
            note_sp = (Sprite)Resources.Load("Image/note" + (i + 11), typeof(Sprite));
            note.GetComponent<SpriteRenderer>().sprite = note_sp;
            sp = (Sprite)Resources.Load("Image/name" + (i + 11), typeof(Sprite));
            n.GetComponent<SpriteRenderer>().sprite = sp;
        }
        else
        {
            i--;
            v.y = vy[i];
            note.transform.position = v;
            note_sp = (Sprite)Resources.Load("Image/note" + (i + 11), typeof(Sprite));
            note.GetComponent<SpriteRenderer>().sprite = note_sp;
            sp = (Sprite)Resources.Load("Image/name" + (i + 11), typeof(Sprite));
            n.GetComponent<SpriteRenderer>().sprite = sp;
        }
    }

    public void rightClick()
    {
        if (i == 3)
        {
            i = 0;
            v.y = vy[i];
            note.transform.position = v;
            note_sp = (Sprite)Resources.Load("Image/note" + (i + 11), typeof(Sprite));
            note.GetComponent<SpriteRenderer>().sprite = note_sp;
            sp = (Sprite)Resources.Load("Image/name" + (i + 11), typeof(Sprite));
            n.GetComponent<SpriteRenderer>().sprite = sp;
        }
        else
        {
            i++;
            v.y = vy[i];
            note.transform.position = v;
            note_sp = (Sprite)Resources.Load("Image/note" + (i + 11), typeof(Sprite));
            note.GetComponent<SpriteRenderer>().sprite = note_sp;
            sp = (Sprite)Resources.Load("Image/name" + (i + 11), typeof(Sprite));
            n.GetComponent<SpriteRenderer>().sprite = sp;
        }
    }
}
