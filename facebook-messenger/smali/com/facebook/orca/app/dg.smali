.class Lcom/facebook/orca/app/dg;
.super Lcom/facebook/inject/d;
.source "MessagesModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/threadview/dn;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/app/h;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/app/h;)V
    .locals 0

    .prologue
    .line 1920
    iput-object p1, p0, Lcom/facebook/orca/app/dg;->a:Lcom/facebook/orca/app/h;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V
    .locals 0

    .prologue
    .line 1920
    invoke-direct {p0, p1}, Lcom/facebook/orca/app/dg;-><init>(Lcom/facebook/orca/app/h;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/threadview/dn;
    .locals 3

    .prologue
    .line 1924
    new-instance v2, Lcom/facebook/orca/threadview/dn;

    const-class v0, Landroid/content/Context;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/dg;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    const-class v1, Lcom/facebook/orca/common/ui/widgets/text/a;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/dg;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/orca/common/ui/widgets/text/a;

    invoke-direct {v2, v0, v1}, Lcom/facebook/orca/threadview/dn;-><init>(Landroid/content/Context;Lcom/facebook/orca/common/ui/widgets/text/a;)V

    return-object v2
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1920
    invoke-virtual {p0}, Lcom/facebook/orca/app/dg;->a()Lcom/facebook/orca/threadview/dn;

    move-result-object v0

    return-object v0
.end method
