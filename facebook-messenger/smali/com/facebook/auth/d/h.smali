.class Lcom/facebook/auth/d/h;
.super Lcom/facebook/inject/d;
.source "LoggedInUserAuthModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/auth/d/b;


# direct methods
.method private constructor <init>(Lcom/facebook/auth/d/b;)V
    .locals 0

    .prologue
    .line 118
    iput-object p1, p0, Lcom/facebook/auth/d/h;->a:Lcom/facebook/auth/d/b;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/auth/d/b;Lcom/facebook/auth/d/c;)V
    .locals 0

    .prologue
    .line 118
    invoke-direct {p0, p1}, Lcom/facebook/auth/d/h;-><init>(Lcom/facebook/auth/d/b;)V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 2

    .prologue
    .line 121
    const-class v0, Lcom/facebook/user/User;

    const-class v1, Lcom/facebook/auth/annotations/LoggedInUser;

    invoke-virtual {p0, v0, v1}, Lcom/facebook/auth/d/h;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/User;

    .line 122
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/facebook/user/User;->b()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 118
    invoke-virtual {p0}, Lcom/facebook/auth/d/h;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
