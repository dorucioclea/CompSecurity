.class Lcom/facebook/orca/app/dm;
.super Lcom/facebook/inject/d;
.source "MessagesModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/phonenumber/identification/f;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/app/h;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/app/h;)V
    .locals 0

    .prologue
    .line 2030
    iput-object p1, p0, Lcom/facebook/orca/app/dm;->a:Lcom/facebook/orca/app/h;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V
    .locals 0

    .prologue
    .line 2030
    invoke-direct {p0, p1}, Lcom/facebook/orca/app/dm;-><init>(Lcom/facebook/orca/app/h;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/phonenumber/identification/f;
    .locals 1

    .prologue
    .line 2035
    new-instance v0, Lcom/facebook/orca/phonenumber/identification/f;

    invoke-direct {v0}, Lcom/facebook/orca/phonenumber/identification/f;-><init>()V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 2030
    invoke-virtual {p0}, Lcom/facebook/orca/app/dm;->a()Lcom/facebook/orca/phonenumber/identification/f;

    move-result-object v0

    return-object v0
.end method
