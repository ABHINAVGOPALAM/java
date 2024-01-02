#define Max_Nodes 1024
#define INFINTY 1000000000000
int n,dist[Max_Nodes][Max_Nodes];

void shortest_path(int s,int t,int path[])
{
    struct state
    {
        int pre;
        int length;
        enum{permanent,tentative} label;
    }state[Max_Nodes];

    int i,k,min;
    struct state *p;
    for (p=&state[0];p<&state[n];p++)
    {
        p->predecessor=-1;
        p->length=INFINTY;
        p->label=tentative;
    }
    state[t].length=0;
    state[t].label=permanent;
    k=t;
    do
    {
        for(i=0;i<n;i++)
            if(dist[k][i]!=0 && state[i].label==tentative)
            {
                if(state[k].length+dist[k][i]<state[i].length)
                {
                    state[i].predecessor=k;
                    state[i].length=state[k].length +dist[k][i];
                }
            }
        k=0;min=INFINTY;
        for(i=0;i<n;i++)
            if(state[i].label==tentative && state[i].length<min){
            min=state[i].length;
            k=i;
            }
        state[k].label=permanent;
    }while(k!=s);
    i=0;k=s;
    do{
        path[i++]=k;
        k=state[k].predecessor;
    }while(k>=0);
}

