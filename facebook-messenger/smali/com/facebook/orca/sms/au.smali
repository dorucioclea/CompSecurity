.class Lcom/facebook/orca/sms/au;
.super Lcom/facebook/inject/d;
.source "MmsSmsModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/sms/af;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/sms/ah;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/sms/ah;)V
    .locals 0

    .prologue
    .line 424
    iput-object p1, p0, Lcom/facebook/orca/sms/au;->a:Lcom/facebook/orca/sms/ah;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/sms/ah;Lcom/facebook/orca/sms/ai;)V
    .locals 0

    .prologue
    .line 424
    invoke-direct {p0, p1}, Lcom/facebook/orca/sms/au;-><init>(Lcom/facebook/orca/sms/ah;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/sms/af;
    .locals 5

    .prologue
    .line 427
    new-instance v4, Lcom/facebook/orca/sms/af;

    invoke-virtual {p0}, Lcom/facebook/orca/sms/au;->e()Lcom/facebook/inject/ab;

    move-result-object v0

    const-class v1, Landroid/content/Context;

    invoke-interface {v0, v1}, Lcom/facebook/inject/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    const-class v1, Lcom/facebook/analytics/av;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/sms/au;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/analytics/av;

    const-class v2, Landroid/content/pm/PackageManager;

    invoke-virtual {p0, v2}, Lcom/facebook/orca/sms/au;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/pm/PackageManager;

    const-class v3, Lcom/facebook/prefs/shared/d;

    invoke-virtual {p0, v3}, Lcom/facebook/orca/sms/au;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/prefs/shared/d;

    invoke-direct {v4, v0, v1, v2, v3}, Lcom/facebook/orca/sms/af;-><init>(Landroid/content/Context;Lcom/facebook/analytics/av;Landroid/content/pm/PackageManager;Lcom/facebook/prefs/shared/d;)V

    return-object v4
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 424
    invoke-virtual {p0}, Lcom/facebook/orca/sms/au;->a()Lcom/facebook/orca/sms/af;

    move-result-object v0

    return-object v0
.end method
